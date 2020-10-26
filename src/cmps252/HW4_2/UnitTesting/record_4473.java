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

@Tag("28")
class Record_4473 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4473: FirstName is Maricela")
	void FirstNameOfRecord4473() {
		assertEquals("Maricela", customers.get(4472).getFirstName());
	}

	@Test
	@DisplayName("Record 4473: LastName is Bartunek")
	void LastNameOfRecord4473() {
		assertEquals("Bartunek", customers.get(4472).getLastName());
	}

	@Test
	@DisplayName("Record 4473: Company is Collins, William F Iii")
	void CompanyOfRecord4473() {
		assertEquals("Collins, William F Iii", customers.get(4472).getCompany());
	}

	@Test
	@DisplayName("Record 4473: Address is 118 Powers Ave")
	void AddressOfRecord4473() {
		assertEquals("118 Powers Ave", customers.get(4472).getAddress());
	}

	@Test
	@DisplayName("Record 4473: City is Santa Barbara")
	void CityOfRecord4473() {
		assertEquals("Santa Barbara", customers.get(4472).getCity());
	}

	@Test
	@DisplayName("Record 4473: County is Santa Barbara")
	void CountyOfRecord4473() {
		assertEquals("Santa Barbara", customers.get(4472).getCounty());
	}

	@Test
	@DisplayName("Record 4473: State is CA")
	void StateOfRecord4473() {
		assertEquals("CA", customers.get(4472).getState());
	}

	@Test
	@DisplayName("Record 4473: ZIP is 93103")
	void ZIPOfRecord4473() {
		assertEquals("93103", customers.get(4472).getZIP());
	}

	@Test
	@DisplayName("Record 4473: Phone is 805-564-7781")
	void PhoneOfRecord4473() {
		assertEquals("805-564-7781", customers.get(4472).getPhone());
	}

	@Test
	@DisplayName("Record 4473: Fax is 805-564-8377")
	void FaxOfRecord4473() {
		assertEquals("805-564-8377", customers.get(4472).getFax());
	}

	@Test
	@DisplayName("Record 4473: Email is maricela@bartunek.com")
	void EmailOfRecord4473() {
		assertEquals("maricela@bartunek.com", customers.get(4472).getEmail());
	}

	@Test
	@DisplayName("Record 4473: Web is http://www.maricelabartunek.com")
	void WebOfRecord4473() {
		assertEquals("http://www.maricelabartunek.com", customers.get(4472).getWeb());
	}
}
