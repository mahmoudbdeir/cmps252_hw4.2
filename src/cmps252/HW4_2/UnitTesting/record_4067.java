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

@Tag("39")
class Record_4067 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4067: FirstName is Kyle")
	void FirstNameOfRecord4067() {
		assertEquals("Kyle", customers.get(4066).getFirstName());
	}

	@Test
	@DisplayName("Record 4067: LastName is Shewmake")
	void LastNameOfRecord4067() {
		assertEquals("Shewmake", customers.get(4066).getLastName());
	}

	@Test
	@DisplayName("Record 4067: Company is Century 21 Mountain Realty")
	void CompanyOfRecord4067() {
		assertEquals("Century 21 Mountain Realty", customers.get(4066).getCompany());
	}

	@Test
	@DisplayName("Record 4067: Address is 250 Esten Ave")
	void AddressOfRecord4067() {
		assertEquals("250 Esten Ave", customers.get(4066).getAddress());
	}

	@Test
	@DisplayName("Record 4067: City is Pawtucket")
	void CityOfRecord4067() {
		assertEquals("Pawtucket", customers.get(4066).getCity());
	}

	@Test
	@DisplayName("Record 4067: County is Providence")
	void CountyOfRecord4067() {
		assertEquals("Providence", customers.get(4066).getCounty());
	}

	@Test
	@DisplayName("Record 4067: State is RI")
	void StateOfRecord4067() {
		assertEquals("RI", customers.get(4066).getState());
	}

	@Test
	@DisplayName("Record 4067: ZIP is 2860")
	void ZIPOfRecord4067() {
		assertEquals("2860", customers.get(4066).getZIP());
	}

	@Test
	@DisplayName("Record 4067: Phone is 401-725-9548")
	void PhoneOfRecord4067() {
		assertEquals("401-725-9548", customers.get(4066).getPhone());
	}

	@Test
	@DisplayName("Record 4067: Fax is 401-725-2597")
	void FaxOfRecord4067() {
		assertEquals("401-725-2597", customers.get(4066).getFax());
	}

	@Test
	@DisplayName("Record 4067: Email is kyle@shewmake.com")
	void EmailOfRecord4067() {
		assertEquals("kyle@shewmake.com", customers.get(4066).getEmail());
	}

	@Test
	@DisplayName("Record 4067: Web is http://www.kyleshewmake.com")
	void WebOfRecord4067() {
		assertEquals("http://www.kyleshewmake.com", customers.get(4066).getWeb());
	}
}
