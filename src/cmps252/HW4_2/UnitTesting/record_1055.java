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

@Tag("21")
class Record_1055 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1055: FirstName is Kristin")
	void FirstNameOfRecord1055() {
		assertEquals("Kristin", customers.get(1054).getFirstName());
	}

	@Test
	@DisplayName("Record 1055: LastName is Prust")
	void LastNameOfRecord1055() {
		assertEquals("Prust", customers.get(1054).getLastName());
	}

	@Test
	@DisplayName("Record 1055: Company is Classified Exchange")
	void CompanyOfRecord1055() {
		assertEquals("Classified Exchange", customers.get(1054).getCompany());
	}

	@Test
	@DisplayName("Record 1055: Address is 600 S Virginia St")
	void AddressOfRecord1055() {
		assertEquals("600 S Virginia St", customers.get(1054).getAddress());
	}

	@Test
	@DisplayName("Record 1055: City is Reno")
	void CityOfRecord1055() {
		assertEquals("Reno", customers.get(1054).getCity());
	}

	@Test
	@DisplayName("Record 1055: County is Washoe")
	void CountyOfRecord1055() {
		assertEquals("Washoe", customers.get(1054).getCounty());
	}

	@Test
	@DisplayName("Record 1055: State is NV")
	void StateOfRecord1055() {
		assertEquals("NV", customers.get(1054).getState());
	}

	@Test
	@DisplayName("Record 1055: ZIP is 89501")
	void ZIPOfRecord1055() {
		assertEquals("89501", customers.get(1054).getZIP());
	}

	@Test
	@DisplayName("Record 1055: Phone is 775-786-7604")
	void PhoneOfRecord1055() {
		assertEquals("775-786-7604", customers.get(1054).getPhone());
	}

	@Test
	@DisplayName("Record 1055: Fax is 775-786-5488")
	void FaxOfRecord1055() {
		assertEquals("775-786-5488", customers.get(1054).getFax());
	}

	@Test
	@DisplayName("Record 1055: Email is kristin@prust.com")
	void EmailOfRecord1055() {
		assertEquals("kristin@prust.com", customers.get(1054).getEmail());
	}

	@Test
	@DisplayName("Record 1055: Web is http://www.kristinprust.com")
	void WebOfRecord1055() {
		assertEquals("http://www.kristinprust.com", customers.get(1054).getWeb());
	}
}
