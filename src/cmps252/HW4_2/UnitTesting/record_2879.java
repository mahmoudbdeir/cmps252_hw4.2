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

@Tag("22")
class Record_2879 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2879: FirstName is Rolando")
	void FirstNameOfRecord2879() {
		assertEquals("Rolando", customers.get(2878).getFirstName());
	}

	@Test
	@DisplayName("Record 2879: LastName is Penkalski")
	void LastNameOfRecord2879() {
		assertEquals("Penkalski", customers.get(2878).getLastName());
	}

	@Test
	@DisplayName("Record 2879: Company is Cogun Industries Inc")
	void CompanyOfRecord2879() {
		assertEquals("Cogun Industries Inc", customers.get(2878).getCompany());
	}

	@Test
	@DisplayName("Record 2879: Address is 2407 25th Ave")
	void AddressOfRecord2879() {
		assertEquals("2407 25th Ave", customers.get(2878).getAddress());
	}

	@Test
	@DisplayName("Record 2879: City is Gulfport")
	void CityOfRecord2879() {
		assertEquals("Gulfport", customers.get(2878).getCity());
	}

	@Test
	@DisplayName("Record 2879: County is Harrison")
	void CountyOfRecord2879() {
		assertEquals("Harrison", customers.get(2878).getCounty());
	}

	@Test
	@DisplayName("Record 2879: State is MS")
	void StateOfRecord2879() {
		assertEquals("MS", customers.get(2878).getState());
	}

	@Test
	@DisplayName("Record 2879: ZIP is 39501")
	void ZIPOfRecord2879() {
		assertEquals("39501", customers.get(2878).getZIP());
	}

	@Test
	@DisplayName("Record 2879: Phone is 228-831-2924")
	void PhoneOfRecord2879() {
		assertEquals("228-831-2924", customers.get(2878).getPhone());
	}

	@Test
	@DisplayName("Record 2879: Fax is 228-831-1446")
	void FaxOfRecord2879() {
		assertEquals("228-831-1446", customers.get(2878).getFax());
	}

	@Test
	@DisplayName("Record 2879: Email is rolando@penkalski.com")
	void EmailOfRecord2879() {
		assertEquals("rolando@penkalski.com", customers.get(2878).getEmail());
	}

	@Test
	@DisplayName("Record 2879: Web is http://www.rolandopenkalski.com")
	void WebOfRecord2879() {
		assertEquals("http://www.rolandopenkalski.com", customers.get(2878).getWeb());
	}
}
