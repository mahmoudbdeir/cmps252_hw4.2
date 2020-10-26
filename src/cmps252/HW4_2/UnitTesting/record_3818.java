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

@Tag("0")
class Record_3818 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3818: FirstName is Raul")
	void FirstNameOfRecord3818() {
		assertEquals("Raul", customers.get(3817).getFirstName());
	}

	@Test
	@DisplayName("Record 3818: LastName is Vandermeulen")
	void LastNameOfRecord3818() {
		assertEquals("Vandermeulen", customers.get(3817).getLastName());
	}

	@Test
	@DisplayName("Record 3818: Company is Cannons Bkpg & Payroll Svc")
	void CompanyOfRecord3818() {
		assertEquals("Cannons Bkpg & Payroll Svc", customers.get(3817).getCompany());
	}

	@Test
	@DisplayName("Record 3818: Address is 15123 34th Ave")
	void AddressOfRecord3818() {
		assertEquals("15123 34th Ave", customers.get(3817).getAddress());
	}

	@Test
	@DisplayName("Record 3818: City is Flushing")
	void CityOfRecord3818() {
		assertEquals("Flushing", customers.get(3817).getCity());
	}

	@Test
	@DisplayName("Record 3818: County is Queens")
	void CountyOfRecord3818() {
		assertEquals("Queens", customers.get(3817).getCounty());
	}

	@Test
	@DisplayName("Record 3818: State is NY")
	void StateOfRecord3818() {
		assertEquals("NY", customers.get(3817).getState());
	}

	@Test
	@DisplayName("Record 3818: ZIP is 11354")
	void ZIPOfRecord3818() {
		assertEquals("11354", customers.get(3817).getZIP());
	}

	@Test
	@DisplayName("Record 3818: Phone is 718-358-9187")
	void PhoneOfRecord3818() {
		assertEquals("718-358-9187", customers.get(3817).getPhone());
	}

	@Test
	@DisplayName("Record 3818: Fax is 718-358-0139")
	void FaxOfRecord3818() {
		assertEquals("718-358-0139", customers.get(3817).getFax());
	}

	@Test
	@DisplayName("Record 3818: Email is raul@vandermeulen.com")
	void EmailOfRecord3818() {
		assertEquals("raul@vandermeulen.com", customers.get(3817).getEmail());
	}

	@Test
	@DisplayName("Record 3818: Web is http://www.raulvandermeulen.com")
	void WebOfRecord3818() {
		assertEquals("http://www.raulvandermeulen.com", customers.get(3817).getWeb());
	}
}
