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

@Tag("0")
class Record_1159 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1159: FirstName is Rowena")
	void FirstNameOfRecord1159() {
		assertEquals("Rowena", customers.get(1158).getFirstName());
	}

	@Test
	@DisplayName("Record 1159: LastName is Solaita")
	void LastNameOfRecord1159() {
		assertEquals("Solaita", customers.get(1158).getLastName());
	}

	@Test
	@DisplayName("Record 1159: Company is Everbrite Inc")
	void CompanyOfRecord1159() {
		assertEquals("Everbrite Inc", customers.get(1158).getCompany());
	}

	@Test
	@DisplayName("Record 1159: Address is 611 Washington Ave")
	void AddressOfRecord1159() {
		assertEquals("611 Washington Ave", customers.get(1158).getAddress());
	}

	@Test
	@DisplayName("Record 1159: City is Waco")
	void CityOfRecord1159() {
		assertEquals("Waco", customers.get(1158).getCity());
	}

	@Test
	@DisplayName("Record 1159: County is McLennan")
	void CountyOfRecord1159() {
		assertEquals("McLennan", customers.get(1158).getCounty());
	}

	@Test
	@DisplayName("Record 1159: State is TX")
	void StateOfRecord1159() {
		assertEquals("TX", customers.get(1158).getState());
	}

	@Test
	@DisplayName("Record 1159: ZIP is 76701")
	void ZIPOfRecord1159() {
		assertEquals("76701", customers.get(1158).getZIP());
	}

	@Test
	@DisplayName("Record 1159: Phone is 254-752-6139")
	void PhoneOfRecord1159() {
		assertEquals("254-752-6139", customers.get(1158).getPhone());
	}

	@Test
	@DisplayName("Record 1159: Fax is 254-752-3641")
	void FaxOfRecord1159() {
		assertEquals("254-752-3641", customers.get(1158).getFax());
	}

	@Test
	@DisplayName("Record 1159: Email is rowena@solaita.com")
	void EmailOfRecord1159() {
		assertEquals("rowena@solaita.com", customers.get(1158).getEmail());
	}

	@Test
	@DisplayName("Record 1159: Web is http://www.rowenasolaita.com")
	void WebOfRecord1159() {
		assertEquals("http://www.rowenasolaita.com", customers.get(1158).getWeb());
	}
}
