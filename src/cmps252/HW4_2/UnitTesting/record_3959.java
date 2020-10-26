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

@Tag("31")
class Record_3959 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3959: FirstName is Courtney")
	void FirstNameOfRecord3959() {
		assertEquals("Courtney", customers.get(3958).getFirstName());
	}

	@Test
	@DisplayName("Record 3959: LastName is Mettig")
	void LastNameOfRecord3959() {
		assertEquals("Mettig", customers.get(3958).getLastName());
	}

	@Test
	@DisplayName("Record 3959: Company is Collier, George H Md")
	void CompanyOfRecord3959() {
		assertEquals("Collier, George H Md", customers.get(3958).getCompany());
	}

	@Test
	@DisplayName("Record 3959: Address is 600 S College St")
	void AddressOfRecord3959() {
		assertEquals("600 S College St", customers.get(3958).getAddress());
	}

	@Test
	@DisplayName("Record 3959: City is Charlotte")
	void CityOfRecord3959() {
		assertEquals("Charlotte", customers.get(3958).getCity());
	}

	@Test
	@DisplayName("Record 3959: County is Mecklenburg")
	void CountyOfRecord3959() {
		assertEquals("Mecklenburg", customers.get(3958).getCounty());
	}

	@Test
	@DisplayName("Record 3959: State is NC")
	void StateOfRecord3959() {
		assertEquals("NC", customers.get(3958).getState());
	}

	@Test
	@DisplayName("Record 3959: ZIP is 28202")
	void ZIPOfRecord3959() {
		assertEquals("28202", customers.get(3958).getZIP());
	}

	@Test
	@DisplayName("Record 3959: Phone is 704-333-7145")
	void PhoneOfRecord3959() {
		assertEquals("704-333-7145", customers.get(3958).getPhone());
	}

	@Test
	@DisplayName("Record 3959: Fax is 704-333-7005")
	void FaxOfRecord3959() {
		assertEquals("704-333-7005", customers.get(3958).getFax());
	}

	@Test
	@DisplayName("Record 3959: Email is courtney@mettig.com")
	void EmailOfRecord3959() {
		assertEquals("courtney@mettig.com", customers.get(3958).getEmail());
	}

	@Test
	@DisplayName("Record 3959: Web is http://www.courtneymettig.com")
	void WebOfRecord3959() {
		assertEquals("http://www.courtneymettig.com", customers.get(3958).getWeb());
	}
}
