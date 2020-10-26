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

@Tag("38")
class Record_4469 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4469: FirstName is Malissa")
	void FirstNameOfRecord4469() {
		assertEquals("Malissa", customers.get(4468).getFirstName());
	}

	@Test
	@DisplayName("Record 4469: LastName is Okojie")
	void LastNameOfRecord4469() {
		assertEquals("Okojie", customers.get(4468).getLastName());
	}

	@Test
	@DisplayName("Record 4469: Company is Wolf Insurance Agency")
	void CompanyOfRecord4469() {
		assertEquals("Wolf Insurance Agency", customers.get(4468).getCompany());
	}

	@Test
	@DisplayName("Record 4469: Address is 307 Leaders Hyghts Rd")
	void AddressOfRecord4469() {
		assertEquals("307 Leaders Hyghts Rd", customers.get(4468).getAddress());
	}

	@Test
	@DisplayName("Record 4469: City is York")
	void CityOfRecord4469() {
		assertEquals("York", customers.get(4468).getCity());
	}

	@Test
	@DisplayName("Record 4469: County is York")
	void CountyOfRecord4469() {
		assertEquals("York", customers.get(4468).getCounty());
	}

	@Test
	@DisplayName("Record 4469: State is PA")
	void StateOfRecord4469() {
		assertEquals("PA", customers.get(4468).getState());
	}

	@Test
	@DisplayName("Record 4469: ZIP is 17402")
	void ZIPOfRecord4469() {
		assertEquals("17402", customers.get(4468).getZIP());
	}

	@Test
	@DisplayName("Record 4469: Phone is 717-741-6274")
	void PhoneOfRecord4469() {
		assertEquals("717-741-6274", customers.get(4468).getPhone());
	}

	@Test
	@DisplayName("Record 4469: Fax is 717-741-0673")
	void FaxOfRecord4469() {
		assertEquals("717-741-0673", customers.get(4468).getFax());
	}

	@Test
	@DisplayName("Record 4469: Email is malissa@okojie.com")
	void EmailOfRecord4469() {
		assertEquals("malissa@okojie.com", customers.get(4468).getEmail());
	}

	@Test
	@DisplayName("Record 4469: Web is http://www.malissaokojie.com")
	void WebOfRecord4469() {
		assertEquals("http://www.malissaokojie.com", customers.get(4468).getWeb());
	}
}
