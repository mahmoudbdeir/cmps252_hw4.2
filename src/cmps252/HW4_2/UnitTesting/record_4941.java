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
class Record_4941 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4941: FirstName is Rupert")
	void FirstNameOfRecord4941() {
		assertEquals("Rupert", customers.get(4940).getFirstName());
	}

	@Test
	@DisplayName("Record 4941: LastName is Bokor")
	void LastNameOfRecord4941() {
		assertEquals("Bokor", customers.get(4940).getLastName());
	}

	@Test
	@DisplayName("Record 4941: Company is Coburn, Carl R")
	void CompanyOfRecord4941() {
		assertEquals("Coburn, Carl R", customers.get(4940).getCompany());
	}

	@Test
	@DisplayName("Record 4941: Address is 2000 Market St")
	void AddressOfRecord4941() {
		assertEquals("2000 Market St", customers.get(4940).getAddress());
	}

	@Test
	@DisplayName("Record 4941: City is Philadelphia")
	void CityOfRecord4941() {
		assertEquals("Philadelphia", customers.get(4940).getCity());
	}

	@Test
	@DisplayName("Record 4941: County is Philadelphia")
	void CountyOfRecord4941() {
		assertEquals("Philadelphia", customers.get(4940).getCounty());
	}

	@Test
	@DisplayName("Record 4941: State is PA")
	void StateOfRecord4941() {
		assertEquals("PA", customers.get(4940).getState());
	}

	@Test
	@DisplayName("Record 4941: ZIP is 19103")
	void ZIPOfRecord4941() {
		assertEquals("19103", customers.get(4940).getZIP());
	}

	@Test
	@DisplayName("Record 4941: Phone is 215-561-6393")
	void PhoneOfRecord4941() {
		assertEquals("215-561-6393", customers.get(4940).getPhone());
	}

	@Test
	@DisplayName("Record 4941: Fax is 215-561-4703")
	void FaxOfRecord4941() {
		assertEquals("215-561-4703", customers.get(4940).getFax());
	}

	@Test
	@DisplayName("Record 4941: Email is rupert@bokor.com")
	void EmailOfRecord4941() {
		assertEquals("rupert@bokor.com", customers.get(4940).getEmail());
	}

	@Test
	@DisplayName("Record 4941: Web is http://www.rupertbokor.com")
	void WebOfRecord4941() {
		assertEquals("http://www.rupertbokor.com", customers.get(4940).getWeb());
	}
}
