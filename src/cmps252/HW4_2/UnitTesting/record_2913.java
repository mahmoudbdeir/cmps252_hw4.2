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

@Tag("11")
class Record_2913 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2913: FirstName is Kara")
	void FirstNameOfRecord2913() {
		assertEquals("Kara", customers.get(2912).getFirstName());
	}

	@Test
	@DisplayName("Record 2913: LastName is Caulk")
	void LastNameOfRecord2913() {
		assertEquals("Caulk", customers.get(2912).getLastName());
	}

	@Test
	@DisplayName("Record 2913: Company is Haygro Sales Inc")
	void CompanyOfRecord2913() {
		assertEquals("Haygro Sales Inc", customers.get(2912).getCompany());
	}

	@Test
	@DisplayName("Record 2913: Address is 2370 Maggio Cir")
	void AddressOfRecord2913() {
		assertEquals("2370 Maggio Cir", customers.get(2912).getAddress());
	}

	@Test
	@DisplayName("Record 2913: City is Lodi")
	void CityOfRecord2913() {
		assertEquals("Lodi", customers.get(2912).getCity());
	}

	@Test
	@DisplayName("Record 2913: County is San Joaquin")
	void CountyOfRecord2913() {
		assertEquals("San Joaquin", customers.get(2912).getCounty());
	}

	@Test
	@DisplayName("Record 2913: State is CA")
	void StateOfRecord2913() {
		assertEquals("CA", customers.get(2912).getState());
	}

	@Test
	@DisplayName("Record 2913: ZIP is 95240")
	void ZIPOfRecord2913() {
		assertEquals("95240", customers.get(2912).getZIP());
	}

	@Test
	@DisplayName("Record 2913: Phone is 209-366-6502")
	void PhoneOfRecord2913() {
		assertEquals("209-366-6502", customers.get(2912).getPhone());
	}

	@Test
	@DisplayName("Record 2913: Fax is 209-366-6778")
	void FaxOfRecord2913() {
		assertEquals("209-366-6778", customers.get(2912).getFax());
	}

	@Test
	@DisplayName("Record 2913: Email is kara@caulk.com")
	void EmailOfRecord2913() {
		assertEquals("kara@caulk.com", customers.get(2912).getEmail());
	}

	@Test
	@DisplayName("Record 2913: Web is http://www.karacaulk.com")
	void WebOfRecord2913() {
		assertEquals("http://www.karacaulk.com", customers.get(2912).getWeb());
	}
}
