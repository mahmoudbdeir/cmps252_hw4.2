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

@Tag("13")
class Record_2027 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2027: FirstName is Marcelo")
	void FirstNameOfRecord2027() {
		assertEquals("Marcelo", customers.get(2026).getFirstName());
	}

	@Test
	@DisplayName("Record 2027: LastName is Mccoppin")
	void LastNameOfRecord2027() {
		assertEquals("Mccoppin", customers.get(2026).getLastName());
	}

	@Test
	@DisplayName("Record 2027: Company is Cosol Commercial Real Estate")
	void CompanyOfRecord2027() {
		assertEquals("Cosol Commercial Real Estate", customers.get(2026).getCompany());
	}

	@Test
	@DisplayName("Record 2027: Address is 724 Speedwell Ave")
	void AddressOfRecord2027() {
		assertEquals("724 Speedwell Ave", customers.get(2026).getAddress());
	}

	@Test
	@DisplayName("Record 2027: City is Morris Plains")
	void CityOfRecord2027() {
		assertEquals("Morris Plains", customers.get(2026).getCity());
	}

	@Test
	@DisplayName("Record 2027: County is Morris")
	void CountyOfRecord2027() {
		assertEquals("Morris", customers.get(2026).getCounty());
	}

	@Test
	@DisplayName("Record 2027: State is NJ")
	void StateOfRecord2027() {
		assertEquals("NJ", customers.get(2026).getState());
	}

	@Test
	@DisplayName("Record 2027: ZIP is 7950")
	void ZIPOfRecord2027() {
		assertEquals("7950", customers.get(2026).getZIP());
	}

	@Test
	@DisplayName("Record 2027: Phone is 973-539-8661")
	void PhoneOfRecord2027() {
		assertEquals("973-539-8661", customers.get(2026).getPhone());
	}

	@Test
	@DisplayName("Record 2027: Fax is 973-539-7664")
	void FaxOfRecord2027() {
		assertEquals("973-539-7664", customers.get(2026).getFax());
	}

	@Test
	@DisplayName("Record 2027: Email is marcelo@mccoppin.com")
	void EmailOfRecord2027() {
		assertEquals("marcelo@mccoppin.com", customers.get(2026).getEmail());
	}

	@Test
	@DisplayName("Record 2027: Web is http://www.marcelomccoppin.com")
	void WebOfRecord2027() {
		assertEquals("http://www.marcelomccoppin.com", customers.get(2026).getWeb());
	}
}
