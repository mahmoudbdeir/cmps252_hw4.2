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

@Tag("3")
class Record_2979 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2979: FirstName is Ellen")
	void FirstNameOfRecord2979() {
		assertEquals("Ellen", customers.get(2978).getFirstName());
	}

	@Test
	@DisplayName("Record 2979: LastName is Brets")
	void LastNameOfRecord2979() {
		assertEquals("Brets", customers.get(2978).getLastName());
	}

	@Test
	@DisplayName("Record 2979: Company is Automated Builders")
	void CompanyOfRecord2979() {
		assertEquals("Automated Builders", customers.get(2978).getCompany());
	}

	@Test
	@DisplayName("Record 2979: Address is 2630 W Laskey Rd")
	void AddressOfRecord2979() {
		assertEquals("2630 W Laskey Rd", customers.get(2978).getAddress());
	}

	@Test
	@DisplayName("Record 2979: City is Toledo")
	void CityOfRecord2979() {
		assertEquals("Toledo", customers.get(2978).getCity());
	}

	@Test
	@DisplayName("Record 2979: County is Lucas")
	void CountyOfRecord2979() {
		assertEquals("Lucas", customers.get(2978).getCounty());
	}

	@Test
	@DisplayName("Record 2979: State is OH")
	void StateOfRecord2979() {
		assertEquals("OH", customers.get(2978).getState());
	}

	@Test
	@DisplayName("Record 2979: ZIP is 43613")
	void ZIPOfRecord2979() {
		assertEquals("43613", customers.get(2978).getZIP());
	}

	@Test
	@DisplayName("Record 2979: Phone is 419-473-4797")
	void PhoneOfRecord2979() {
		assertEquals("419-473-4797", customers.get(2978).getPhone());
	}

	@Test
	@DisplayName("Record 2979: Fax is 419-473-1175")
	void FaxOfRecord2979() {
		assertEquals("419-473-1175", customers.get(2978).getFax());
	}

	@Test
	@DisplayName("Record 2979: Email is ellen@brets.com")
	void EmailOfRecord2979() {
		assertEquals("ellen@brets.com", customers.get(2978).getEmail());
	}

	@Test
	@DisplayName("Record 2979: Web is http://www.ellenbrets.com")
	void WebOfRecord2979() {
		assertEquals("http://www.ellenbrets.com", customers.get(2978).getWeb());
	}
}
