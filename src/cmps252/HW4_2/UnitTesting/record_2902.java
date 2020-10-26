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

@Tag("36")
class Record_2902 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2902: FirstName is Sharon")
	void FirstNameOfRecord2902() {
		assertEquals("Sharon", customers.get(2901).getFirstName());
	}

	@Test
	@DisplayName("Record 2902: LastName is Tokich")
	void LastNameOfRecord2902() {
		assertEquals("Tokich", customers.get(2901).getLastName());
	}

	@Test
	@DisplayName("Record 2902: Company is Will County Government")
	void CompanyOfRecord2902() {
		assertEquals("Will County Government", customers.get(2901).getCompany());
	}

	@Test
	@DisplayName("Record 2902: Address is 2322 S Union Ave")
	void AddressOfRecord2902() {
		assertEquals("2322 S Union Ave", customers.get(2901).getAddress());
	}

	@Test
	@DisplayName("Record 2902: City is Alliance")
	void CityOfRecord2902() {
		assertEquals("Alliance", customers.get(2901).getCity());
	}

	@Test
	@DisplayName("Record 2902: County is Stark")
	void CountyOfRecord2902() {
		assertEquals("Stark", customers.get(2901).getCounty());
	}

	@Test
	@DisplayName("Record 2902: State is OH")
	void StateOfRecord2902() {
		assertEquals("OH", customers.get(2901).getState());
	}

	@Test
	@DisplayName("Record 2902: ZIP is 44601")
	void ZIPOfRecord2902() {
		assertEquals("44601", customers.get(2901).getZIP());
	}

	@Test
	@DisplayName("Record 2902: Phone is 330-823-1943")
	void PhoneOfRecord2902() {
		assertEquals("330-823-1943", customers.get(2901).getPhone());
	}

	@Test
	@DisplayName("Record 2902: Fax is 330-823-2268")
	void FaxOfRecord2902() {
		assertEquals("330-823-2268", customers.get(2901).getFax());
	}

	@Test
	@DisplayName("Record 2902: Email is sharon@tokich.com")
	void EmailOfRecord2902() {
		assertEquals("sharon@tokich.com", customers.get(2901).getEmail());
	}

	@Test
	@DisplayName("Record 2902: Web is http://www.sharontokich.com")
	void WebOfRecord2902() {
		assertEquals("http://www.sharontokich.com", customers.get(2901).getWeb());
	}
}
