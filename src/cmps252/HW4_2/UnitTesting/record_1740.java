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

@Tag("9")
class Record_1740 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1740: FirstName is Roberta")
	void FirstNameOfRecord1740() {
		assertEquals("Roberta", customers.get(1739).getFirstName());
	}

	@Test
	@DisplayName("Record 1740: LastName is Douyette")
	void LastNameOfRecord1740() {
		assertEquals("Douyette", customers.get(1739).getLastName());
	}

	@Test
	@DisplayName("Record 1740: Company is Sungear Inc")
	void CompanyOfRecord1740() {
		assertEquals("Sungear Inc", customers.get(1739).getCompany());
	}

	@Test
	@DisplayName("Record 1740: Address is 42 Bayview Ave")
	void AddressOfRecord1740() {
		assertEquals("42 Bayview Ave", customers.get(1739).getAddress());
	}

	@Test
	@DisplayName("Record 1740: City is Manhasset")
	void CityOfRecord1740() {
		assertEquals("Manhasset", customers.get(1739).getCity());
	}

	@Test
	@DisplayName("Record 1740: County is Nassau")
	void CountyOfRecord1740() {
		assertEquals("Nassau", customers.get(1739).getCounty());
	}

	@Test
	@DisplayName("Record 1740: State is NY")
	void StateOfRecord1740() {
		assertEquals("NY", customers.get(1739).getState());
	}

	@Test
	@DisplayName("Record 1740: ZIP is 11030")
	void ZIPOfRecord1740() {
		assertEquals("11030", customers.get(1739).getZIP());
	}

	@Test
	@DisplayName("Record 1740: Phone is 516-893-8525")
	void PhoneOfRecord1740() {
		assertEquals("516-893-8525", customers.get(1739).getPhone());
	}

	@Test
	@DisplayName("Record 1740: Fax is 516-893-4459")
	void FaxOfRecord1740() {
		assertEquals("516-893-4459", customers.get(1739).getFax());
	}

	@Test
	@DisplayName("Record 1740: Email is roberta@douyette.com")
	void EmailOfRecord1740() {
		assertEquals("roberta@douyette.com", customers.get(1739).getEmail());
	}

	@Test
	@DisplayName("Record 1740: Web is http://www.robertadouyette.com")
	void WebOfRecord1740() {
		assertEquals("http://www.robertadouyette.com", customers.get(1739).getWeb());
	}
}
