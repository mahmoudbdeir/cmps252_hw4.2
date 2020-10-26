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
class Record_3609 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3609: FirstName is Tami")
	void FirstNameOfRecord3609() {
		assertEquals("Tami", customers.get(3608).getFirstName());
	}

	@Test
	@DisplayName("Record 3609: LastName is Langlands")
	void LastNameOfRecord3609() {
		assertEquals("Langlands", customers.get(3608).getLastName());
	}

	@Test
	@DisplayName("Record 3609: Company is Janie Jasin Csp Pro Speaker")
	void CompanyOfRecord3609() {
		assertEquals("Janie Jasin Csp Pro Speaker", customers.get(3608).getCompany());
	}

	@Test
	@DisplayName("Record 3609: Address is 999 Ponce De Leon Blvd  #-1")
	void AddressOfRecord3609() {
		assertEquals("999 Ponce De Leon Blvd  #-1", customers.get(3608).getAddress());
	}

	@Test
	@DisplayName("Record 3609: City is Miami")
	void CityOfRecord3609() {
		assertEquals("Miami", customers.get(3608).getCity());
	}

	@Test
	@DisplayName("Record 3609: County is Miami-Dade")
	void CountyOfRecord3609() {
		assertEquals("Miami-Dade", customers.get(3608).getCounty());
	}

	@Test
	@DisplayName("Record 3609: State is FL")
	void StateOfRecord3609() {
		assertEquals("FL", customers.get(3608).getState());
	}

	@Test
	@DisplayName("Record 3609: ZIP is 33134")
	void ZIPOfRecord3609() {
		assertEquals("33134", customers.get(3608).getZIP());
	}

	@Test
	@DisplayName("Record 3609: Phone is 305-443-1532")
	void PhoneOfRecord3609() {
		assertEquals("305-443-1532", customers.get(3608).getPhone());
	}

	@Test
	@DisplayName("Record 3609: Fax is 305-443-4831")
	void FaxOfRecord3609() {
		assertEquals("305-443-4831", customers.get(3608).getFax());
	}

	@Test
	@DisplayName("Record 3609: Email is tami@langlands.com")
	void EmailOfRecord3609() {
		assertEquals("tami@langlands.com", customers.get(3608).getEmail());
	}

	@Test
	@DisplayName("Record 3609: Web is http://www.tamilanglands.com")
	void WebOfRecord3609() {
		assertEquals("http://www.tamilanglands.com", customers.get(3608).getWeb());
	}
}
