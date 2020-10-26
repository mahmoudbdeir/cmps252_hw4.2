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

@Tag("45")
class Record_3110 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3110: FirstName is Mallory")
	void FirstNameOfRecord3110() {
		assertEquals("Mallory", customers.get(3109).getFirstName());
	}

	@Test
	@DisplayName("Record 3110: LastName is Dipanfilo")
	void LastNameOfRecord3110() {
		assertEquals("Dipanfilo", customers.get(3109).getLastName());
	}

	@Test
	@DisplayName("Record 3110: Company is Untd Methdst Chrchs Omaha Dist")
	void CompanyOfRecord3110() {
		assertEquals("Untd Methdst Chrchs Omaha Dist", customers.get(3109).getCompany());
	}

	@Test
	@DisplayName("Record 3110: Address is 999 E Touhy Ave")
	void AddressOfRecord3110() {
		assertEquals("999 E Touhy Ave", customers.get(3109).getAddress());
	}

	@Test
	@DisplayName("Record 3110: City is Des Plaines")
	void CityOfRecord3110() {
		assertEquals("Des Plaines", customers.get(3109).getCity());
	}

	@Test
	@DisplayName("Record 3110: County is Cook")
	void CountyOfRecord3110() {
		assertEquals("Cook", customers.get(3109).getCounty());
	}

	@Test
	@DisplayName("Record 3110: State is IL")
	void StateOfRecord3110() {
		assertEquals("IL", customers.get(3109).getState());
	}

	@Test
	@DisplayName("Record 3110: ZIP is 60018")
	void ZIPOfRecord3110() {
		assertEquals("60018", customers.get(3109).getZIP());
	}

	@Test
	@DisplayName("Record 3110: Phone is 847-390-8583")
	void PhoneOfRecord3110() {
		assertEquals("847-390-8583", customers.get(3109).getPhone());
	}

	@Test
	@DisplayName("Record 3110: Fax is 847-390-6918")
	void FaxOfRecord3110() {
		assertEquals("847-390-6918", customers.get(3109).getFax());
	}

	@Test
	@DisplayName("Record 3110: Email is mallory@dipanfilo.com")
	void EmailOfRecord3110() {
		assertEquals("mallory@dipanfilo.com", customers.get(3109).getEmail());
	}

	@Test
	@DisplayName("Record 3110: Web is http://www.mallorydipanfilo.com")
	void WebOfRecord3110() {
		assertEquals("http://www.mallorydipanfilo.com", customers.get(3109).getWeb());
	}
}
