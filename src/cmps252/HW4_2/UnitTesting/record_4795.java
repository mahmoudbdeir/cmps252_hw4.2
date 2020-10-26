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

@Tag("34")
class Record_4795 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4795: FirstName is Rosalinda")
	void FirstNameOfRecord4795() {
		assertEquals("Rosalinda", customers.get(4794).getFirstName());
	}

	@Test
	@DisplayName("Record 4795: LastName is Bonavita")
	void LastNameOfRecord4795() {
		assertEquals("Bonavita", customers.get(4794).getLastName());
	}

	@Test
	@DisplayName("Record 4795: Company is Scott Robert Limited")
	void CompanyOfRecord4795() {
		assertEquals("Scott Robert Limited", customers.get(4794).getCompany());
	}

	@Test
	@DisplayName("Record 4795: Address is 11020 White Rock Rd")
	void AddressOfRecord4795() {
		assertEquals("11020 White Rock Rd", customers.get(4794).getAddress());
	}

	@Test
	@DisplayName("Record 4795: City is Rancho Cordova")
	void CityOfRecord4795() {
		assertEquals("Rancho Cordova", customers.get(4794).getCity());
	}

	@Test
	@DisplayName("Record 4795: County is Sacramento")
	void CountyOfRecord4795() {
		assertEquals("Sacramento", customers.get(4794).getCounty());
	}

	@Test
	@DisplayName("Record 4795: State is CA")
	void StateOfRecord4795() {
		assertEquals("CA", customers.get(4794).getState());
	}

	@Test
	@DisplayName("Record 4795: ZIP is 95670")
	void ZIPOfRecord4795() {
		assertEquals("95670", customers.get(4794).getZIP());
	}

	@Test
	@DisplayName("Record 4795: Phone is 916-852-7394")
	void PhoneOfRecord4795() {
		assertEquals("916-852-7394", customers.get(4794).getPhone());
	}

	@Test
	@DisplayName("Record 4795: Fax is 916-852-3815")
	void FaxOfRecord4795() {
		assertEquals("916-852-3815", customers.get(4794).getFax());
	}

	@Test
	@DisplayName("Record 4795: Email is rosalinda@bonavita.com")
	void EmailOfRecord4795() {
		assertEquals("rosalinda@bonavita.com", customers.get(4794).getEmail());
	}

	@Test
	@DisplayName("Record 4795: Web is http://www.rosalindabonavita.com")
	void WebOfRecord4795() {
		assertEquals("http://www.rosalindabonavita.com", customers.get(4794).getWeb());
	}
}
