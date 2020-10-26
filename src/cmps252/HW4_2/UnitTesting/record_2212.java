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
class Record_2212 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2212: FirstName is Mara")
	void FirstNameOfRecord2212() {
		assertEquals("Mara", customers.get(2211).getFirstName());
	}

	@Test
	@DisplayName("Record 2212: LastName is Dutton")
	void LastNameOfRecord2212() {
		assertEquals("Dutton", customers.get(2211).getLastName());
	}

	@Test
	@DisplayName("Record 2212: Company is Lex Realty")
	void CompanyOfRecord2212() {
		assertEquals("Lex Realty", customers.get(2211).getCompany());
	}

	@Test
	@DisplayName("Record 2212: Address is 2545 Spring Arbor Rd")
	void AddressOfRecord2212() {
		assertEquals("2545 Spring Arbor Rd", customers.get(2211).getAddress());
	}

	@Test
	@DisplayName("Record 2212: City is Jackson")
	void CityOfRecord2212() {
		assertEquals("Jackson", customers.get(2211).getCity());
	}

	@Test
	@DisplayName("Record 2212: County is Jackson")
	void CountyOfRecord2212() {
		assertEquals("Jackson", customers.get(2211).getCounty());
	}

	@Test
	@DisplayName("Record 2212: State is MI")
	void StateOfRecord2212() {
		assertEquals("MI", customers.get(2211).getState());
	}

	@Test
	@DisplayName("Record 2212: ZIP is 49203")
	void ZIPOfRecord2212() {
		assertEquals("49203", customers.get(2211).getZIP());
	}

	@Test
	@DisplayName("Record 2212: Phone is 517-788-2365")
	void PhoneOfRecord2212() {
		assertEquals("517-788-2365", customers.get(2211).getPhone());
	}

	@Test
	@DisplayName("Record 2212: Fax is 517-788-5651")
	void FaxOfRecord2212() {
		assertEquals("517-788-5651", customers.get(2211).getFax());
	}

	@Test
	@DisplayName("Record 2212: Email is mara@dutton.com")
	void EmailOfRecord2212() {
		assertEquals("mara@dutton.com", customers.get(2211).getEmail());
	}

	@Test
	@DisplayName("Record 2212: Web is http://www.maradutton.com")
	void WebOfRecord2212() {
		assertEquals("http://www.maradutton.com", customers.get(2211).getWeb());
	}
}
