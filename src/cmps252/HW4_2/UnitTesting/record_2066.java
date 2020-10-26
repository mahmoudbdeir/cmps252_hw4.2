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

@Tag("38")
class Record_2066 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2066: FirstName is Delois")
	void FirstNameOfRecord2066() {
		assertEquals("Delois", customers.get(2065).getFirstName());
	}

	@Test
	@DisplayName("Record 2066: LastName is Carbajal")
	void LastNameOfRecord2066() {
		assertEquals("Carbajal", customers.get(2065).getLastName());
	}

	@Test
	@DisplayName("Record 2066: Company is Alaska Business Monthly")
	void CompanyOfRecord2066() {
		assertEquals("Alaska Business Monthly", customers.get(2065).getCompany());
	}

	@Test
	@DisplayName("Record 2066: Address is 2875 Feather River Blvd")
	void AddressOfRecord2066() {
		assertEquals("2875 Feather River Blvd", customers.get(2065).getAddress());
	}

	@Test
	@DisplayName("Record 2066: City is Oroville")
	void CityOfRecord2066() {
		assertEquals("Oroville", customers.get(2065).getCity());
	}

	@Test
	@DisplayName("Record 2066: County is Butte")
	void CountyOfRecord2066() {
		assertEquals("Butte", customers.get(2065).getCounty());
	}

	@Test
	@DisplayName("Record 2066: State is CA")
	void StateOfRecord2066() {
		assertEquals("CA", customers.get(2065).getState());
	}

	@Test
	@DisplayName("Record 2066: ZIP is 95965")
	void ZIPOfRecord2066() {
		assertEquals("95965", customers.get(2065).getZIP());
	}

	@Test
	@DisplayName("Record 2066: Phone is 530-534-2739")
	void PhoneOfRecord2066() {
		assertEquals("530-534-2739", customers.get(2065).getPhone());
	}

	@Test
	@DisplayName("Record 2066: Fax is 530-534-6922")
	void FaxOfRecord2066() {
		assertEquals("530-534-6922", customers.get(2065).getFax());
	}

	@Test
	@DisplayName("Record 2066: Email is delois@carbajal.com")
	void EmailOfRecord2066() {
		assertEquals("delois@carbajal.com", customers.get(2065).getEmail());
	}

	@Test
	@DisplayName("Record 2066: Web is http://www.deloiscarbajal.com")
	void WebOfRecord2066() {
		assertEquals("http://www.deloiscarbajal.com", customers.get(2065).getWeb());
	}
}
