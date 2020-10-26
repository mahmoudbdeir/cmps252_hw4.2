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

@Tag("47")
class Record_4369 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4369: FirstName is Janelle")
	void FirstNameOfRecord4369() {
		assertEquals("Janelle", customers.get(4368).getFirstName());
	}

	@Test
	@DisplayName("Record 4369: LastName is Tomshack")
	void LastNameOfRecord4369() {
		assertEquals("Tomshack", customers.get(4368).getLastName());
	}

	@Test
	@DisplayName("Record 4369: Company is Comfort Inn At Penns Landing")
	void CompanyOfRecord4369() {
		assertEquals("Comfort Inn At Penns Landing", customers.get(4368).getCompany());
	}

	@Test
	@DisplayName("Record 4369: Address is 730 Argyle Rd")
	void AddressOfRecord4369() {
		assertEquals("730 Argyle Rd", customers.get(4368).getAddress());
	}

	@Test
	@DisplayName("Record 4369: City is Wynnewood")
	void CityOfRecord4369() {
		assertEquals("Wynnewood", customers.get(4368).getCity());
	}

	@Test
	@DisplayName("Record 4369: County is Montgomery")
	void CountyOfRecord4369() {
		assertEquals("Montgomery", customers.get(4368).getCounty());
	}

	@Test
	@DisplayName("Record 4369: State is PA")
	void StateOfRecord4369() {
		assertEquals("PA", customers.get(4368).getState());
	}

	@Test
	@DisplayName("Record 4369: ZIP is 19096")
	void ZIPOfRecord4369() {
		assertEquals("19096", customers.get(4368).getZIP());
	}

	@Test
	@DisplayName("Record 4369: Phone is 610-649-1968")
	void PhoneOfRecord4369() {
		assertEquals("610-649-1968", customers.get(4368).getPhone());
	}

	@Test
	@DisplayName("Record 4369: Fax is 610-649-8924")
	void FaxOfRecord4369() {
		assertEquals("610-649-8924", customers.get(4368).getFax());
	}

	@Test
	@DisplayName("Record 4369: Email is janelle@tomshack.com")
	void EmailOfRecord4369() {
		assertEquals("janelle@tomshack.com", customers.get(4368).getEmail());
	}

	@Test
	@DisplayName("Record 4369: Web is http://www.janelletomshack.com")
	void WebOfRecord4369() {
		assertEquals("http://www.janelletomshack.com", customers.get(4368).getWeb());
	}
}
