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
class Record_39 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 39: FirstName is Whitney")
	void FirstNameOfRecord39() {
		assertEquals("Whitney", customers.get(38).getFirstName());
	}

	@Test
	@DisplayName("Record 39: LastName is Falto")
	void LastNameOfRecord39() {
		assertEquals("Falto", customers.get(38).getLastName());
	}

	@Test
	@DisplayName("Record 39: Company is Sir Speedy Prntng Center")
	void CompanyOfRecord39() {
		assertEquals("Sir Speedy Prntng Center", customers.get(38).getCompany());
	}

	@Test
	@DisplayName("Record 39: Address is 2301 York Rd")
	void AddressOfRecord39() {
		assertEquals("2301 York Rd", customers.get(38).getAddress());
	}

	@Test
	@DisplayName("Record 39: City is Lutherville Timonium")
	void CityOfRecord39() {
		assertEquals("Lutherville Timonium", customers.get(38).getCity());
	}

	@Test
	@DisplayName("Record 39: County is Baltimore")
	void CountyOfRecord39() {
		assertEquals("Baltimore", customers.get(38).getCounty());
	}

	@Test
	@DisplayName("Record 39: State is MD")
	void StateOfRecord39() {
		assertEquals("MD", customers.get(38).getState());
	}

	@Test
	@DisplayName("Record 39: ZIP is 21093")
	void ZIPOfRecord39() {
		assertEquals("21093", customers.get(38).getZIP());
	}

	@Test
	@DisplayName("Record 39: Phone is 410-252-8465")
	void PhoneOfRecord39() {
		assertEquals("410-252-8465", customers.get(38).getPhone());
	}

	@Test
	@DisplayName("Record 39: Fax is 410-252-7867")
	void FaxOfRecord39() {
		assertEquals("410-252-7867", customers.get(38).getFax());
	}

	@Test
	@DisplayName("Record 39: Email is whitney@falto.com")
	void EmailOfRecord39() {
		assertEquals("whitney@falto.com", customers.get(38).getEmail());
	}

	@Test
	@DisplayName("Record 39: Web is http://www.whitneyfalto.com")
	void WebOfRecord39() {
		assertEquals("http://www.whitneyfalto.com", customers.get(38).getWeb());
	}
}
