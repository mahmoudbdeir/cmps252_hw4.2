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
class Record_2248 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2248: FirstName is Anna")
	void FirstNameOfRecord2248() {
		assertEquals("Anna", customers.get(2247).getFirstName());
	}

	@Test
	@DisplayName("Record 2248: LastName is Schyn")
	void LastNameOfRecord2248() {
		assertEquals("Schyn", customers.get(2247).getLastName());
	}

	@Test
	@DisplayName("Record 2248: Company is Van Wert Federal Savings Bank")
	void CompanyOfRecord2248() {
		assertEquals("Van Wert Federal Savings Bank", customers.get(2247).getCompany());
	}

	@Test
	@DisplayName("Record 2248: Address is 1480 Thomas St")
	void AddressOfRecord2248() {
		assertEquals("1480 Thomas St", customers.get(2247).getAddress());
	}

	@Test
	@DisplayName("Record 2248: City is Memphis")
	void CityOfRecord2248() {
		assertEquals("Memphis", customers.get(2247).getCity());
	}

	@Test
	@DisplayName("Record 2248: County is Shelby")
	void CountyOfRecord2248() {
		assertEquals("Shelby", customers.get(2247).getCounty());
	}

	@Test
	@DisplayName("Record 2248: State is TN")
	void StateOfRecord2248() {
		assertEquals("TN", customers.get(2247).getState());
	}

	@Test
	@DisplayName("Record 2248: ZIP is 38107")
	void ZIPOfRecord2248() {
		assertEquals("38107", customers.get(2247).getZIP());
	}

	@Test
	@DisplayName("Record 2248: Phone is 901-529-3175")
	void PhoneOfRecord2248() {
		assertEquals("901-529-3175", customers.get(2247).getPhone());
	}

	@Test
	@DisplayName("Record 2248: Fax is 901-529-8933")
	void FaxOfRecord2248() {
		assertEquals("901-529-8933", customers.get(2247).getFax());
	}

	@Test
	@DisplayName("Record 2248: Email is anna@schyn.com")
	void EmailOfRecord2248() {
		assertEquals("anna@schyn.com", customers.get(2247).getEmail());
	}

	@Test
	@DisplayName("Record 2248: Web is http://www.annaschyn.com")
	void WebOfRecord2248() {
		assertEquals("http://www.annaschyn.com", customers.get(2247).getWeb());
	}
}
