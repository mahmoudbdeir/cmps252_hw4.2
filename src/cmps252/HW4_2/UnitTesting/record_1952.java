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

@Tag("23")
class Record_1952 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1952: FirstName is Ella")
	void FirstNameOfRecord1952() {
		assertEquals("Ella", customers.get(1951).getFirstName());
	}

	@Test
	@DisplayName("Record 1952: LastName is Terrian")
	void LastNameOfRecord1952() {
		assertEquals("Terrian", customers.get(1951).getLastName());
	}

	@Test
	@DisplayName("Record 1952: Company is Wysleder Lincoln Merc Mazda")
	void CompanyOfRecord1952() {
		assertEquals("Wysleder Lincoln Merc Mazda", customers.get(1951).getCompany());
	}

	@Test
	@DisplayName("Record 1952: Address is 1237 W Bruce St")
	void AddressOfRecord1952() {
		assertEquals("1237 W Bruce St", customers.get(1951).getAddress());
	}

	@Test
	@DisplayName("Record 1952: City is Milwaukee")
	void CityOfRecord1952() {
		assertEquals("Milwaukee", customers.get(1951).getCity());
	}

	@Test
	@DisplayName("Record 1952: County is Milwaukee")
	void CountyOfRecord1952() {
		assertEquals("Milwaukee", customers.get(1951).getCounty());
	}

	@Test
	@DisplayName("Record 1952: State is WI")
	void StateOfRecord1952() {
		assertEquals("WI", customers.get(1951).getState());
	}

	@Test
	@DisplayName("Record 1952: ZIP is 53204")
	void ZIPOfRecord1952() {
		assertEquals("53204", customers.get(1951).getZIP());
	}

	@Test
	@DisplayName("Record 1952: Phone is 414-383-3072")
	void PhoneOfRecord1952() {
		assertEquals("414-383-3072", customers.get(1951).getPhone());
	}

	@Test
	@DisplayName("Record 1952: Fax is 414-383-9676")
	void FaxOfRecord1952() {
		assertEquals("414-383-9676", customers.get(1951).getFax());
	}

	@Test
	@DisplayName("Record 1952: Email is ella@terrian.com")
	void EmailOfRecord1952() {
		assertEquals("ella@terrian.com", customers.get(1951).getEmail());
	}

	@Test
	@DisplayName("Record 1952: Web is http://www.ellaterrian.com")
	void WebOfRecord1952() {
		assertEquals("http://www.ellaterrian.com", customers.get(1951).getWeb());
	}
}
