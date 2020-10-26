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

@Tag("24")
class Record_1223 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1223: FirstName is Grover")
	void FirstNameOfRecord1223() {
		assertEquals("Grover", customers.get(1222).getFirstName());
	}

	@Test
	@DisplayName("Record 1223: LastName is Badour")
	void LastNameOfRecord1223() {
		assertEquals("Badour", customers.get(1222).getLastName());
	}

	@Test
	@DisplayName("Record 1223: Company is Bubbl Tec")
	void CompanyOfRecord1223() {
		assertEquals("Bubbl Tec", customers.get(1222).getCompany());
	}

	@Test
	@DisplayName("Record 1223: Address is 747 W Indiana Ave")
	void AddressOfRecord1223() {
		assertEquals("747 W Indiana Ave", customers.get(1222).getAddress());
	}

	@Test
	@DisplayName("Record 1223: City is South Bend")
	void CityOfRecord1223() {
		assertEquals("South Bend", customers.get(1222).getCity());
	}

	@Test
	@DisplayName("Record 1223: County is St Joseph")
	void CountyOfRecord1223() {
		assertEquals("St Joseph", customers.get(1222).getCounty());
	}

	@Test
	@DisplayName("Record 1223: State is IN")
	void StateOfRecord1223() {
		assertEquals("IN", customers.get(1222).getState());
	}

	@Test
	@DisplayName("Record 1223: ZIP is 46613")
	void ZIPOfRecord1223() {
		assertEquals("46613", customers.get(1222).getZIP());
	}

	@Test
	@DisplayName("Record 1223: Phone is 574-289-1656")
	void PhoneOfRecord1223() {
		assertEquals("574-289-1656", customers.get(1222).getPhone());
	}

	@Test
	@DisplayName("Record 1223: Fax is 574-289-9296")
	void FaxOfRecord1223() {
		assertEquals("574-289-9296", customers.get(1222).getFax());
	}

	@Test
	@DisplayName("Record 1223: Email is grover@badour.com")
	void EmailOfRecord1223() {
		assertEquals("grover@badour.com", customers.get(1222).getEmail());
	}

	@Test
	@DisplayName("Record 1223: Web is http://www.groverbadour.com")
	void WebOfRecord1223() {
		assertEquals("http://www.groverbadour.com", customers.get(1222).getWeb());
	}
}
