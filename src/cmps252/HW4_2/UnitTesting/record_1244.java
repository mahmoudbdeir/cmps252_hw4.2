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

@Tag("0")
class Record_1244 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1244: FirstName is Robyn")
	void FirstNameOfRecord1244() {
		assertEquals("Robyn", customers.get(1243).getFirstName());
	}

	@Test
	@DisplayName("Record 1244: LastName is Menso")
	void LastNameOfRecord1244() {
		assertEquals("Menso", customers.get(1243).getLastName());
	}

	@Test
	@DisplayName("Record 1244: Company is Corroon, Willis")
	void CompanyOfRecord1244() {
		assertEquals("Corroon, Willis", customers.get(1243).getCompany());
	}

	@Test
	@DisplayName("Record 1244: Address is 94475 Ukee St  #-b")
	void AddressOfRecord1244() {
		assertEquals("94475 Ukee St  #-b", customers.get(1243).getAddress());
	}

	@Test
	@DisplayName("Record 1244: City is Waipahu")
	void CityOfRecord1244() {
		assertEquals("Waipahu", customers.get(1243).getCity());
	}

	@Test
	@DisplayName("Record 1244: County is Honolulu")
	void CountyOfRecord1244() {
		assertEquals("Honolulu", customers.get(1243).getCounty());
	}

	@Test
	@DisplayName("Record 1244: State is HI")
	void StateOfRecord1244() {
		assertEquals("HI", customers.get(1243).getState());
	}

	@Test
	@DisplayName("Record 1244: ZIP is 96797")
	void ZIPOfRecord1244() {
		assertEquals("96797", customers.get(1243).getZIP());
	}

	@Test
	@DisplayName("Record 1244: Phone is 808-676-8468")
	void PhoneOfRecord1244() {
		assertEquals("808-676-8468", customers.get(1243).getPhone());
	}

	@Test
	@DisplayName("Record 1244: Fax is 808-676-0867")
	void FaxOfRecord1244() {
		assertEquals("808-676-0867", customers.get(1243).getFax());
	}

	@Test
	@DisplayName("Record 1244: Email is robyn@menso.com")
	void EmailOfRecord1244() {
		assertEquals("robyn@menso.com", customers.get(1243).getEmail());
	}

	@Test
	@DisplayName("Record 1244: Web is http://www.robynmenso.com")
	void WebOfRecord1244() {
		assertEquals("http://www.robynmenso.com", customers.get(1243).getWeb());
	}
}
