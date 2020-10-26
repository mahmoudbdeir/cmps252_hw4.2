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

@Tag("6")
class Record_1134 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1134: FirstName is Eldon")
	void FirstNameOfRecord1134() {
		assertEquals("Eldon", customers.get(1133).getFirstName());
	}

	@Test
	@DisplayName("Record 1134: LastName is Mcvey")
	void LastNameOfRecord1134() {
		assertEquals("Mcvey", customers.get(1133).getLastName());
	}

	@Test
	@DisplayName("Record 1134: Company is Computerized Data Systems Inc")
	void CompanyOfRecord1134() {
		assertEquals("Computerized Data Systems Inc", customers.get(1133).getCompany());
	}

	@Test
	@DisplayName("Record 1134: Address is 1029 N Delsea Dr")
	void AddressOfRecord1134() {
		assertEquals("1029 N Delsea Dr", customers.get(1133).getAddress());
	}

	@Test
	@DisplayName("Record 1134: City is Clayton")
	void CityOfRecord1134() {
		assertEquals("Clayton", customers.get(1133).getCity());
	}

	@Test
	@DisplayName("Record 1134: County is Gloucester")
	void CountyOfRecord1134() {
		assertEquals("Gloucester", customers.get(1133).getCounty());
	}

	@Test
	@DisplayName("Record 1134: State is NJ")
	void StateOfRecord1134() {
		assertEquals("NJ", customers.get(1133).getState());
	}

	@Test
	@DisplayName("Record 1134: ZIP is 8312")
	void ZIPOfRecord1134() {
		assertEquals("8312", customers.get(1133).getZIP());
	}

	@Test
	@DisplayName("Record 1134: Phone is 856-881-2596")
	void PhoneOfRecord1134() {
		assertEquals("856-881-2596", customers.get(1133).getPhone());
	}

	@Test
	@DisplayName("Record 1134: Fax is 856-881-1453")
	void FaxOfRecord1134() {
		assertEquals("856-881-1453", customers.get(1133).getFax());
	}

	@Test
	@DisplayName("Record 1134: Email is eldon@mcvey.com")
	void EmailOfRecord1134() {
		assertEquals("eldon@mcvey.com", customers.get(1133).getEmail());
	}

	@Test
	@DisplayName("Record 1134: Web is http://www.eldonmcvey.com")
	void WebOfRecord1134() {
		assertEquals("http://www.eldonmcvey.com", customers.get(1133).getWeb());
	}
}
