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

@Tag("14")
class Record_4257 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4257: FirstName is Staci")
	void FirstNameOfRecord4257() {
		assertEquals("Staci", customers.get(4256).getFirstName());
	}

	@Test
	@DisplayName("Record 4257: LastName is Mcclintic")
	void LastNameOfRecord4257() {
		assertEquals("Mcclintic", customers.get(4256).getLastName());
	}

	@Test
	@DisplayName("Record 4257: Company is H C Roenits Co Inc")
	void CompanyOfRecord4257() {
		assertEquals("H C Roenits Co Inc", customers.get(4256).getCompany());
	}

	@Test
	@DisplayName("Record 4257: Address is 1019 S Zapata Hwy")
	void AddressOfRecord4257() {
		assertEquals("1019 S Zapata Hwy", customers.get(4256).getAddress());
	}

	@Test
	@DisplayName("Record 4257: City is Laredo")
	void CityOfRecord4257() {
		assertEquals("Laredo", customers.get(4256).getCity());
	}

	@Test
	@DisplayName("Record 4257: County is Webb")
	void CountyOfRecord4257() {
		assertEquals("Webb", customers.get(4256).getCounty());
	}

	@Test
	@DisplayName("Record 4257: State is TX")
	void StateOfRecord4257() {
		assertEquals("TX", customers.get(4256).getState());
	}

	@Test
	@DisplayName("Record 4257: ZIP is 78043")
	void ZIPOfRecord4257() {
		assertEquals("78043", customers.get(4256).getZIP());
	}

	@Test
	@DisplayName("Record 4257: Phone is 956-791-5128")
	void PhoneOfRecord4257() {
		assertEquals("956-791-5128", customers.get(4256).getPhone());
	}

	@Test
	@DisplayName("Record 4257: Fax is 956-791-3648")
	void FaxOfRecord4257() {
		assertEquals("956-791-3648", customers.get(4256).getFax());
	}

	@Test
	@DisplayName("Record 4257: Email is staci@mcclintic.com")
	void EmailOfRecord4257() {
		assertEquals("staci@mcclintic.com", customers.get(4256).getEmail());
	}

	@Test
	@DisplayName("Record 4257: Web is http://www.stacimcclintic.com")
	void WebOfRecord4257() {
		assertEquals("http://www.stacimcclintic.com", customers.get(4256).getWeb());
	}
}
