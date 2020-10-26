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
class Record_652 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 652: FirstName is Dante")
	void FirstNameOfRecord652() {
		assertEquals("Dante", customers.get(651).getFirstName());
	}

	@Test
	@DisplayName("Record 652: LastName is Prochazka")
	void LastNameOfRecord652() {
		assertEquals("Prochazka", customers.get(651).getLastName());
	}

	@Test
	@DisplayName("Record 652: Company is Chandler Appraisal Svc Inc")
	void CompanyOfRecord652() {
		assertEquals("Chandler Appraisal Svc Inc", customers.get(651).getCompany());
	}

	@Test
	@DisplayName("Record 652: Address is 994 E 20th St")
	void AddressOfRecord652() {
		assertEquals("994 E 20th St", customers.get(651).getAddress());
	}

	@Test
	@DisplayName("Record 652: City is Chico")
	void CityOfRecord652() {
		assertEquals("Chico", customers.get(651).getCity());
	}

	@Test
	@DisplayName("Record 652: County is Butte")
	void CountyOfRecord652() {
		assertEquals("Butte", customers.get(651).getCounty());
	}

	@Test
	@DisplayName("Record 652: State is CA")
	void StateOfRecord652() {
		assertEquals("CA", customers.get(651).getState());
	}

	@Test
	@DisplayName("Record 652: ZIP is 95928")
	void ZIPOfRecord652() {
		assertEquals("95928", customers.get(651).getZIP());
	}

	@Test
	@DisplayName("Record 652: Phone is 530-891-8582")
	void PhoneOfRecord652() {
		assertEquals("530-891-8582", customers.get(651).getPhone());
	}

	@Test
	@DisplayName("Record 652: Fax is 530-891-6805")
	void FaxOfRecord652() {
		assertEquals("530-891-6805", customers.get(651).getFax());
	}

	@Test
	@DisplayName("Record 652: Email is dante@prochazka.com")
	void EmailOfRecord652() {
		assertEquals("dante@prochazka.com", customers.get(651).getEmail());
	}

	@Test
	@DisplayName("Record 652: Web is http://www.danteprochazka.com")
	void WebOfRecord652() {
		assertEquals("http://www.danteprochazka.com", customers.get(651).getWeb());
	}
}
