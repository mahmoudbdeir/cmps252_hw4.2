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

@Tag("35")
class Record_296 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 296: FirstName is Donn")
	void FirstNameOfRecord296() {
		assertEquals("Donn", customers.get(295).getFirstName());
	}

	@Test
	@DisplayName("Record 296: LastName is Blackwell")
	void LastNameOfRecord296() {
		assertEquals("Blackwell", customers.get(295).getLastName());
	}

	@Test
	@DisplayName("Record 296: Company is Strohym & Romann")
	void CompanyOfRecord296() {
		assertEquals("Strohym & Romann", customers.get(295).getCompany());
	}

	@Test
	@DisplayName("Record 296: Address is 1362 53rd Ave")
	void AddressOfRecord296() {
		assertEquals("1362 53rd Ave", customers.get(295).getAddress());
	}

	@Test
	@DisplayName("Record 296: City is Oakland")
	void CityOfRecord296() {
		assertEquals("Oakland", customers.get(295).getCity());
	}

	@Test
	@DisplayName("Record 296: County is Alameda")
	void CountyOfRecord296() {
		assertEquals("Alameda", customers.get(295).getCounty());
	}

	@Test
	@DisplayName("Record 296: State is CA")
	void StateOfRecord296() {
		assertEquals("CA", customers.get(295).getState());
	}

	@Test
	@DisplayName("Record 296: ZIP is 94601")
	void ZIPOfRecord296() {
		assertEquals("94601", customers.get(295).getZIP());
	}

	@Test
	@DisplayName("Record 296: Phone is 510-533-2400")
	void PhoneOfRecord296() {
		assertEquals("510-533-2400", customers.get(295).getPhone());
	}

	@Test
	@DisplayName("Record 296: Fax is 510-533-4051")
	void FaxOfRecord296() {
		assertEquals("510-533-4051", customers.get(295).getFax());
	}

	@Test
	@DisplayName("Record 296: Email is donn@blackwell.com")
	void EmailOfRecord296() {
		assertEquals("donn@blackwell.com", customers.get(295).getEmail());
	}

	@Test
	@DisplayName("Record 296: Web is http://www.donnblackwell.com")
	void WebOfRecord296() {
		assertEquals("http://www.donnblackwell.com", customers.get(295).getWeb());
	}
}
