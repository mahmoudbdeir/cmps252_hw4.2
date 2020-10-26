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

@Tag("46")
class Record_3474 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3474: FirstName is Dolly")
	void FirstNameOfRecord3474() {
		assertEquals("Dolly", customers.get(3473).getFirstName());
	}

	@Test
	@DisplayName("Record 3474: LastName is Obanion")
	void LastNameOfRecord3474() {
		assertEquals("Obanion", customers.get(3473).getLastName());
	}

	@Test
	@DisplayName("Record 3474: Company is Rinos, Dimitrios C Esq")
	void CompanyOfRecord3474() {
		assertEquals("Rinos, Dimitrios C Esq", customers.get(3473).getCompany());
	}

	@Test
	@DisplayName("Record 3474: Address is 1100 Cornwall Rd")
	void AddressOfRecord3474() {
		assertEquals("1100 Cornwall Rd", customers.get(3473).getAddress());
	}

	@Test
	@DisplayName("Record 3474: City is Monmouth Junction")
	void CityOfRecord3474() {
		assertEquals("Monmouth Junction", customers.get(3473).getCity());
	}

	@Test
	@DisplayName("Record 3474: County is Middlesex")
	void CountyOfRecord3474() {
		assertEquals("Middlesex", customers.get(3473).getCounty());
	}

	@Test
	@DisplayName("Record 3474: State is NJ")
	void StateOfRecord3474() {
		assertEquals("NJ", customers.get(3473).getState());
	}

	@Test
	@DisplayName("Record 3474: ZIP is 8852")
	void ZIPOfRecord3474() {
		assertEquals("8852", customers.get(3473).getZIP());
	}

	@Test
	@DisplayName("Record 3474: Phone is 732-422-0748")
	void PhoneOfRecord3474() {
		assertEquals("732-422-0748", customers.get(3473).getPhone());
	}

	@Test
	@DisplayName("Record 3474: Fax is 732-422-4052")
	void FaxOfRecord3474() {
		assertEquals("732-422-4052", customers.get(3473).getFax());
	}

	@Test
	@DisplayName("Record 3474: Email is dolly@obanion.com")
	void EmailOfRecord3474() {
		assertEquals("dolly@obanion.com", customers.get(3473).getEmail());
	}

	@Test
	@DisplayName("Record 3474: Web is http://www.dollyobanion.com")
	void WebOfRecord3474() {
		assertEquals("http://www.dollyobanion.com", customers.get(3473).getWeb());
	}
}
