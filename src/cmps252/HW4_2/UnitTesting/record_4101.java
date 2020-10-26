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

@Tag("5")
class Record_4101 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4101: FirstName is Natasha")
	void FirstNameOfRecord4101() {
		assertEquals("Natasha", customers.get(4100).getFirstName());
	}

	@Test
	@DisplayName("Record 4101: LastName is Mancil")
	void LastNameOfRecord4101() {
		assertEquals("Mancil", customers.get(4100).getLastName());
	}

	@Test
	@DisplayName("Record 4101: Company is Kcl Financial Services")
	void CompanyOfRecord4101() {
		assertEquals("Kcl Financial Services", customers.get(4100).getCompany());
	}

	@Test
	@DisplayName("Record 4101: Address is 5377 Kendall St")
	void AddressOfRecord4101() {
		assertEquals("5377 Kendall St", customers.get(4100).getAddress());
	}

	@Test
	@DisplayName("Record 4101: City is Boise")
	void CityOfRecord4101() {
		assertEquals("Boise", customers.get(4100).getCity());
	}

	@Test
	@DisplayName("Record 4101: County is Ada")
	void CountyOfRecord4101() {
		assertEquals("Ada", customers.get(4100).getCounty());
	}

	@Test
	@DisplayName("Record 4101: State is ID")
	void StateOfRecord4101() {
		assertEquals("ID", customers.get(4100).getState());
	}

	@Test
	@DisplayName("Record 4101: ZIP is 83706")
	void ZIPOfRecord4101() {
		assertEquals("83706", customers.get(4100).getZIP());
	}

	@Test
	@DisplayName("Record 4101: Phone is 208-377-3641")
	void PhoneOfRecord4101() {
		assertEquals("208-377-3641", customers.get(4100).getPhone());
	}

	@Test
	@DisplayName("Record 4101: Fax is 208-377-3892")
	void FaxOfRecord4101() {
		assertEquals("208-377-3892", customers.get(4100).getFax());
	}

	@Test
	@DisplayName("Record 4101: Email is natasha@mancil.com")
	void EmailOfRecord4101() {
		assertEquals("natasha@mancil.com", customers.get(4100).getEmail());
	}

	@Test
	@DisplayName("Record 4101: Web is http://www.natashamancil.com")
	void WebOfRecord4101() {
		assertEquals("http://www.natashamancil.com", customers.get(4100).getWeb());
	}
}
