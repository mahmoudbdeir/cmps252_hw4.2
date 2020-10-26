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

@Tag("7")
class Record_184 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 184: FirstName is Roberta")
	void FirstNameOfRecord184() {
		assertEquals("Roberta", customers.get(183).getFirstName());
	}

	@Test
	@DisplayName("Record 184: LastName is Petersson")
	void LastNameOfRecord184() {
		assertEquals("Petersson", customers.get(183).getLastName());
	}

	@Test
	@DisplayName("Record 184: Company is Mi Elem & Mid Schl Principals")
	void CompanyOfRecord184() {
		assertEquals("Mi Elem & Mid Schl Principals", customers.get(183).getCompany());
	}

	@Test
	@DisplayName("Record 184: Address is 1903 Cinnaminson Ave")
	void AddressOfRecord184() {
		assertEquals("1903 Cinnaminson Ave", customers.get(183).getAddress());
	}

	@Test
	@DisplayName("Record 184: City is Riverton")
	void CityOfRecord184() {
		assertEquals("Riverton", customers.get(183).getCity());
	}

	@Test
	@DisplayName("Record 184: County is Burlington")
	void CountyOfRecord184() {
		assertEquals("Burlington", customers.get(183).getCounty());
	}

	@Test
	@DisplayName("Record 184: State is NJ")
	void StateOfRecord184() {
		assertEquals("NJ", customers.get(183).getState());
	}

	@Test
	@DisplayName("Record 184: ZIP is 8077")
	void ZIPOfRecord184() {
		assertEquals("8077", customers.get(183).getZIP());
	}

	@Test
	@DisplayName("Record 184: Phone is 856-829-3189")
	void PhoneOfRecord184() {
		assertEquals("856-829-3189", customers.get(183).getPhone());
	}

	@Test
	@DisplayName("Record 184: Fax is 856-829-7249")
	void FaxOfRecord184() {
		assertEquals("856-829-7249", customers.get(183).getFax());
	}

	@Test
	@DisplayName("Record 184: Email is roberta@petersson.com")
	void EmailOfRecord184() {
		assertEquals("roberta@petersson.com", customers.get(183).getEmail());
	}

	@Test
	@DisplayName("Record 184: Web is http://www.robertapetersson.com")
	void WebOfRecord184() {
		assertEquals("http://www.robertapetersson.com", customers.get(183).getWeb());
	}
}
