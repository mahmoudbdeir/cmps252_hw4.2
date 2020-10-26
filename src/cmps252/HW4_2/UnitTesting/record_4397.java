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

@Tag("12")
class Record_4397 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4397: FirstName is Rena")
	void FirstNameOfRecord4397() {
		assertEquals("Rena", customers.get(4396).getFirstName());
	}

	@Test
	@DisplayName("Record 4397: LastName is Scherma")
	void LastNameOfRecord4397() {
		assertEquals("Scherma", customers.get(4396).getLastName());
	}

	@Test
	@DisplayName("Record 4397: Company is Abbotts Frozen Custard")
	void CompanyOfRecord4397() {
		assertEquals("Abbotts Frozen Custard", customers.get(4396).getCompany());
	}

	@Test
	@DisplayName("Record 4397: Address is 1203 Dell Ave")
	void AddressOfRecord4397() {
		assertEquals("1203 Dell Ave", customers.get(4396).getAddress());
	}

	@Test
	@DisplayName("Record 4397: City is Campbell")
	void CityOfRecord4397() {
		assertEquals("Campbell", customers.get(4396).getCity());
	}

	@Test
	@DisplayName("Record 4397: County is Santa Clara")
	void CountyOfRecord4397() {
		assertEquals("Santa Clara", customers.get(4396).getCounty());
	}

	@Test
	@DisplayName("Record 4397: State is CA")
	void StateOfRecord4397() {
		assertEquals("CA", customers.get(4396).getState());
	}

	@Test
	@DisplayName("Record 4397: ZIP is 95008")
	void ZIPOfRecord4397() {
		assertEquals("95008", customers.get(4396).getZIP());
	}

	@Test
	@DisplayName("Record 4397: Phone is 408-374-5675")
	void PhoneOfRecord4397() {
		assertEquals("408-374-5675", customers.get(4396).getPhone());
	}

	@Test
	@DisplayName("Record 4397: Fax is 408-374-9367")
	void FaxOfRecord4397() {
		assertEquals("408-374-9367", customers.get(4396).getFax());
	}

	@Test
	@DisplayName("Record 4397: Email is rena@scherma.com")
	void EmailOfRecord4397() {
		assertEquals("rena@scherma.com", customers.get(4396).getEmail());
	}

	@Test
	@DisplayName("Record 4397: Web is http://www.renascherma.com")
	void WebOfRecord4397() {
		assertEquals("http://www.renascherma.com", customers.get(4396).getWeb());
	}
}
