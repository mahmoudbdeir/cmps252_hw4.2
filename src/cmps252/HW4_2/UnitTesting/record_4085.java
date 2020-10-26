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

@Tag("29")
class Record_4085 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4085: FirstName is Ron")
	void FirstNameOfRecord4085() {
		assertEquals("Ron", customers.get(4084).getFirstName());
	}

	@Test
	@DisplayName("Record 4085: LastName is Ingerson")
	void LastNameOfRecord4085() {
		assertEquals("Ingerson", customers.get(4084).getLastName());
	}

	@Test
	@DisplayName("Record 4085: Company is Gage Productions Inc")
	void CompanyOfRecord4085() {
		assertEquals("Gage Productions Inc", customers.get(4084).getCompany());
	}

	@Test
	@DisplayName("Record 4085: Address is 2904 W 26th St")
	void AddressOfRecord4085() {
		assertEquals("2904 W 26th St", customers.get(4084).getAddress());
	}

	@Test
	@DisplayName("Record 4085: City is Chicago")
	void CityOfRecord4085() {
		assertEquals("Chicago", customers.get(4084).getCity());
	}

	@Test
	@DisplayName("Record 4085: County is Cook")
	void CountyOfRecord4085() {
		assertEquals("Cook", customers.get(4084).getCounty());
	}

	@Test
	@DisplayName("Record 4085: State is IL")
	void StateOfRecord4085() {
		assertEquals("IL", customers.get(4084).getState());
	}

	@Test
	@DisplayName("Record 4085: ZIP is 60623")
	void ZIPOfRecord4085() {
		assertEquals("60623", customers.get(4084).getZIP());
	}

	@Test
	@DisplayName("Record 4085: Phone is 773-847-7793")
	void PhoneOfRecord4085() {
		assertEquals("773-847-7793", customers.get(4084).getPhone());
	}

	@Test
	@DisplayName("Record 4085: Fax is 773-847-4416")
	void FaxOfRecord4085() {
		assertEquals("773-847-4416", customers.get(4084).getFax());
	}

	@Test
	@DisplayName("Record 4085: Email is ron@ingerson.com")
	void EmailOfRecord4085() {
		assertEquals("ron@ingerson.com", customers.get(4084).getEmail());
	}

	@Test
	@DisplayName("Record 4085: Web is http://www.roningerson.com")
	void WebOfRecord4085() {
		assertEquals("http://www.roningerson.com", customers.get(4084).getWeb());
	}
}
