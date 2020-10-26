package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("19")
class Record_52 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 52: FirstName is William")
	void FirstNameOfRecord52() {
		assertEquals("William", customers.get(51).getFirstName());
	}

	@Test
	@DisplayName("Record 52: LastName is Sagal")
	void LastNameOfRecord52() {
		assertEquals("Sagal", customers.get(51).getLastName());
	}

	@Test
	@DisplayName("Record 52: Company is Doughton Hawkins Brockelman")
	void CompanyOfRecord52() {
		assertEquals("Doughton Hawkins Brockelman", customers.get(51).getCompany());
	}

	@Test
	@DisplayName("Record 52: Address is 1210 Se 1st St")
	void AddressOfRecord52() {
		assertEquals("1210 Se 1st St", customers.get(51).getAddress());
	}

	@Test
	@DisplayName("Record 52: City is Boynton Beach")
	void CityOfRecord52() {
		assertEquals("Boynton Beach", customers.get(51).getCity());
	}

	@Test
	@DisplayName("Record 52: County is Palm Beach")
	void CountyOfRecord52() {
		assertEquals("Palm Beach", customers.get(51).getCounty());
	}

	@Test
	@DisplayName("Record 52: State is FL")
	void StateOfRecord52() {
		assertEquals("FL", customers.get(51).getState());
	}

	@Test
	@DisplayName("Record 52: ZIP is 33435")
	void ZIPOfRecord52() {
		assertEquals("33435", customers.get(51).getZIP());
	}

	@Test
	@DisplayName("Record 52: Phone is 561-736-6783")
	void PhoneOfRecord52() {
		assertEquals("561-736-6783", customers.get(51).getPhone());
	}

	@Test
	@DisplayName("Record 52: Fax is 561-736-2315")
	void FaxOfRecord52() {
		assertEquals("561-736-2315", customers.get(51).getFax());
	}

	@Test
	@DisplayName("Record 52: Email is william@sagal.com")
	void EmailOfRecord52() {
		assertEquals("william@sagal.com", customers.get(51).getEmail());
	}

	@Test
	@DisplayName("Record 52: Web is http://www.williamsagal.com")
	void WebOfRecord52() {
		assertEquals("http://www.williamsagal.com", customers.get(51).getWeb());
	}
}
