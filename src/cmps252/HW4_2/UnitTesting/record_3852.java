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
class Record_3852 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3852: FirstName is Lionel")
	void FirstNameOfRecord3852() {
		assertEquals("Lionel", customers.get(3851).getFirstName());
	}

	@Test
	@DisplayName("Record 3852: LastName is Weckhorst")
	void LastNameOfRecord3852() {
		assertEquals("Weckhorst", customers.get(3851).getLastName());
	}

	@Test
	@DisplayName("Record 3852: Company is Cubco Inc")
	void CompanyOfRecord3852() {
		assertEquals("Cubco Inc", customers.get(3851).getCompany());
	}

	@Test
	@DisplayName("Record 3852: Address is 625 Marquette Ave")
	void AddressOfRecord3852() {
		assertEquals("625 Marquette Ave", customers.get(3851).getAddress());
	}

	@Test
	@DisplayName("Record 3852: City is Minneapolis")
	void CityOfRecord3852() {
		assertEquals("Minneapolis", customers.get(3851).getCity());
	}

	@Test
	@DisplayName("Record 3852: County is Hennepin")
	void CountyOfRecord3852() {
		assertEquals("Hennepin", customers.get(3851).getCounty());
	}

	@Test
	@DisplayName("Record 3852: State is MN")
	void StateOfRecord3852() {
		assertEquals("MN", customers.get(3851).getState());
	}

	@Test
	@DisplayName("Record 3852: ZIP is 55402")
	void ZIPOfRecord3852() {
		assertEquals("55402", customers.get(3851).getZIP());
	}

	@Test
	@DisplayName("Record 3852: Phone is 612-342-7824")
	void PhoneOfRecord3852() {
		assertEquals("612-342-7824", customers.get(3851).getPhone());
	}

	@Test
	@DisplayName("Record 3852: Fax is 612-342-6615")
	void FaxOfRecord3852() {
		assertEquals("612-342-6615", customers.get(3851).getFax());
	}

	@Test
	@DisplayName("Record 3852: Email is lionel@weckhorst.com")
	void EmailOfRecord3852() {
		assertEquals("lionel@weckhorst.com", customers.get(3851).getEmail());
	}

	@Test
	@DisplayName("Record 3852: Web is http://www.lionelweckhorst.com")
	void WebOfRecord3852() {
		assertEquals("http://www.lionelweckhorst.com", customers.get(3851).getWeb());
	}
}
