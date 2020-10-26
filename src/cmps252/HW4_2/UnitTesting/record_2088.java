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

@Tag("2")
class Record_2088 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2088: FirstName is Dewey")
	void FirstNameOfRecord2088() {
		assertEquals("Dewey", customers.get(2087).getFirstName());
	}

	@Test
	@DisplayName("Record 2088: LastName is Thiesfeld")
	void LastNameOfRecord2088() {
		assertEquals("Thiesfeld", customers.get(2087).getLastName());
	}

	@Test
	@DisplayName("Record 2088: Company is Hartley, Fred D Esq")
	void CompanyOfRecord2088() {
		assertEquals("Hartley, Fred D Esq", customers.get(2087).getCompany());
	}

	@Test
	@DisplayName("Record 2088: Address is 7538 N Dale Mabry Hwy")
	void AddressOfRecord2088() {
		assertEquals("7538 N Dale Mabry Hwy", customers.get(2087).getAddress());
	}

	@Test
	@DisplayName("Record 2088: City is Tampa")
	void CityOfRecord2088() {
		assertEquals("Tampa", customers.get(2087).getCity());
	}

	@Test
	@DisplayName("Record 2088: County is Hillsborough")
	void CountyOfRecord2088() {
		assertEquals("Hillsborough", customers.get(2087).getCounty());
	}

	@Test
	@DisplayName("Record 2088: State is FL")
	void StateOfRecord2088() {
		assertEquals("FL", customers.get(2087).getState());
	}

	@Test
	@DisplayName("Record 2088: ZIP is 33614")
	void ZIPOfRecord2088() {
		assertEquals("33614", customers.get(2087).getZIP());
	}

	@Test
	@DisplayName("Record 2088: Phone is 813-888-3876")
	void PhoneOfRecord2088() {
		assertEquals("813-888-3876", customers.get(2087).getPhone());
	}

	@Test
	@DisplayName("Record 2088: Fax is 813-888-6342")
	void FaxOfRecord2088() {
		assertEquals("813-888-6342", customers.get(2087).getFax());
	}

	@Test
	@DisplayName("Record 2088: Email is dewey@thiesfeld.com")
	void EmailOfRecord2088() {
		assertEquals("dewey@thiesfeld.com", customers.get(2087).getEmail());
	}

	@Test
	@DisplayName("Record 2088: Web is http://www.deweythiesfeld.com")
	void WebOfRecord2088() {
		assertEquals("http://www.deweythiesfeld.com", customers.get(2087).getWeb());
	}
}
