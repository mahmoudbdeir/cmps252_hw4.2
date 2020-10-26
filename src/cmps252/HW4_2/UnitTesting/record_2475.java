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
class Record_2475 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2475: FirstName is Trisha")
	void FirstNameOfRecord2475() {
		assertEquals("Trisha", customers.get(2474).getFirstName());
	}

	@Test
	@DisplayName("Record 2475: LastName is Somogyi")
	void LastNameOfRecord2475() {
		assertEquals("Somogyi", customers.get(2474).getLastName());
	}

	@Test
	@DisplayName("Record 2475: Company is Mra Publications")
	void CompanyOfRecord2475() {
		assertEquals("Mra Publications", customers.get(2474).getCompany());
	}

	@Test
	@DisplayName("Record 2475: Address is 7 Shetland Ct")
	void AddressOfRecord2475() {
		assertEquals("7 Shetland Ct", customers.get(2474).getAddress());
	}

	@Test
	@DisplayName("Record 2475: City is Littleton")
	void CityOfRecord2475() {
		assertEquals("Littleton", customers.get(2474).getCity());
	}

	@Test
	@DisplayName("Record 2475: County is Douglas")
	void CountyOfRecord2475() {
		assertEquals("Douglas", customers.get(2474).getCounty());
	}

	@Test
	@DisplayName("Record 2475: State is CO")
	void StateOfRecord2475() {
		assertEquals("CO", customers.get(2474).getState());
	}

	@Test
	@DisplayName("Record 2475: ZIP is 80126")
	void ZIPOfRecord2475() {
		assertEquals("80126", customers.get(2474).getZIP());
	}

	@Test
	@DisplayName("Record 2475: Phone is 303-470-0330")
	void PhoneOfRecord2475() {
		assertEquals("303-470-0330", customers.get(2474).getPhone());
	}

	@Test
	@DisplayName("Record 2475: Fax is 303-470-2654")
	void FaxOfRecord2475() {
		assertEquals("303-470-2654", customers.get(2474).getFax());
	}

	@Test
	@DisplayName("Record 2475: Email is trisha@somogyi.com")
	void EmailOfRecord2475() {
		assertEquals("trisha@somogyi.com", customers.get(2474).getEmail());
	}

	@Test
	@DisplayName("Record 2475: Web is http://www.trishasomogyi.com")
	void WebOfRecord2475() {
		assertEquals("http://www.trishasomogyi.com", customers.get(2474).getWeb());
	}
}
