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

@Tag("30")
class Record_2442 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2442: FirstName is Ronny")
	void FirstNameOfRecord2442() {
		assertEquals("Ronny", customers.get(2441).getFirstName());
	}

	@Test
	@DisplayName("Record 2442: LastName is Enriquez")
	void LastNameOfRecord2442() {
		assertEquals("Enriquez", customers.get(2441).getLastName());
	}

	@Test
	@DisplayName("Record 2442: Company is Kaplan, Philip G Esq")
	void CompanyOfRecord2442() {
		assertEquals("Kaplan, Philip G Esq", customers.get(2441).getCompany());
	}

	@Test
	@DisplayName("Record 2442: Address is 9804 Rysterstown Rd")
	void AddressOfRecord2442() {
		assertEquals("9804 Rysterstown Rd", customers.get(2441).getAddress());
	}

	@Test
	@DisplayName("Record 2442: City is Owings Mills")
	void CityOfRecord2442() {
		assertEquals("Owings Mills", customers.get(2441).getCity());
	}

	@Test
	@DisplayName("Record 2442: County is Baltimore")
	void CountyOfRecord2442() {
		assertEquals("Baltimore", customers.get(2441).getCounty());
	}

	@Test
	@DisplayName("Record 2442: State is MD")
	void StateOfRecord2442() {
		assertEquals("MD", customers.get(2441).getState());
	}

	@Test
	@DisplayName("Record 2442: ZIP is 21117")
	void ZIPOfRecord2442() {
		assertEquals("21117", customers.get(2441).getZIP());
	}

	@Test
	@DisplayName("Record 2442: Phone is 410-363-3230")
	void PhoneOfRecord2442() {
		assertEquals("410-363-3230", customers.get(2441).getPhone());
	}

	@Test
	@DisplayName("Record 2442: Fax is 410-363-2678")
	void FaxOfRecord2442() {
		assertEquals("410-363-2678", customers.get(2441).getFax());
	}

	@Test
	@DisplayName("Record 2442: Email is ronny@enriquez.com")
	void EmailOfRecord2442() {
		assertEquals("ronny@enriquez.com", customers.get(2441).getEmail());
	}

	@Test
	@DisplayName("Record 2442: Web is http://www.ronnyenriquez.com")
	void WebOfRecord2442() {
		assertEquals("http://www.ronnyenriquez.com", customers.get(2441).getWeb());
	}
}
