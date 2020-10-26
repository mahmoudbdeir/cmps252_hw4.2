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

@Tag("10")
class Record_333 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 333: FirstName is Liz")
	void FirstNameOfRecord333() {
		assertEquals("Liz", customers.get(332).getFirstName());
	}

	@Test
	@DisplayName("Record 333: LastName is Simmelink")
	void LastNameOfRecord333() {
		assertEquals("Simmelink", customers.get(332).getLastName());
	}

	@Test
	@DisplayName("Record 333: Company is Stabile, Michael R Jr")
	void CompanyOfRecord333() {
		assertEquals("Stabile, Michael R Jr", customers.get(332).getCompany());
	}

	@Test
	@DisplayName("Record 333: Address is 114 Fortin Dr")
	void AddressOfRecord333() {
		assertEquals("114 Fortin Dr", customers.get(332).getAddress());
	}

	@Test
	@DisplayName("Record 333: City is Woonsocket")
	void CityOfRecord333() {
		assertEquals("Woonsocket", customers.get(332).getCity());
	}

	@Test
	@DisplayName("Record 333: County is Providence")
	void CountyOfRecord333() {
		assertEquals("Providence", customers.get(332).getCounty());
	}

	@Test
	@DisplayName("Record 333: State is RI")
	void StateOfRecord333() {
		assertEquals("RI", customers.get(332).getState());
	}

	@Test
	@DisplayName("Record 333: ZIP is 2895")
	void ZIPOfRecord333() {
		assertEquals("2895", customers.get(332).getZIP());
	}

	@Test
	@DisplayName("Record 333: Phone is 401-766-5515")
	void PhoneOfRecord333() {
		assertEquals("401-766-5515", customers.get(332).getPhone());
	}

	@Test
	@DisplayName("Record 333: Fax is 401-766-3802")
	void FaxOfRecord333() {
		assertEquals("401-766-3802", customers.get(332).getFax());
	}

	@Test
	@DisplayName("Record 333: Email is liz@simmelink.com")
	void EmailOfRecord333() {
		assertEquals("liz@simmelink.com", customers.get(332).getEmail());
	}

	@Test
	@DisplayName("Record 333: Web is http://www.lizsimmelink.com")
	void WebOfRecord333() {
		assertEquals("http://www.lizsimmelink.com", customers.get(332).getWeb());
	}
}
