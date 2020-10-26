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

@Tag("16")
class Record_1758 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1758: FirstName is Kyle")
	void FirstNameOfRecord1758() {
		assertEquals("Kyle", customers.get(1757).getFirstName());
	}

	@Test
	@DisplayName("Record 1758: LastName is Parsh")
	void LastNameOfRecord1758() {
		assertEquals("Parsh", customers.get(1757).getLastName());
	}

	@Test
	@DisplayName("Record 1758: Company is Walkup Exterminating Inc")
	void CompanyOfRecord1758() {
		assertEquals("Walkup Exterminating Inc", customers.get(1757).getCompany());
	}

	@Test
	@DisplayName("Record 1758: Address is 195 Bohn St")
	void AddressOfRecord1758() {
		assertEquals("195 Bohn St", customers.get(1757).getAddress());
	}

	@Test
	@DisplayName("Record 1758: City is Biloxi")
	void CityOfRecord1758() {
		assertEquals("Biloxi", customers.get(1757).getCity());
	}

	@Test
	@DisplayName("Record 1758: County is Harrison")
	void CountyOfRecord1758() {
		assertEquals("Harrison", customers.get(1757).getCounty());
	}

	@Test
	@DisplayName("Record 1758: State is MS")
	void StateOfRecord1758() {
		assertEquals("MS", customers.get(1757).getState());
	}

	@Test
	@DisplayName("Record 1758: ZIP is 39530")
	void ZIPOfRecord1758() {
		assertEquals("39530", customers.get(1757).getZIP());
	}

	@Test
	@DisplayName("Record 1758: Phone is 228-435-9576")
	void PhoneOfRecord1758() {
		assertEquals("228-435-9576", customers.get(1757).getPhone());
	}

	@Test
	@DisplayName("Record 1758: Fax is 228-435-2738")
	void FaxOfRecord1758() {
		assertEquals("228-435-2738", customers.get(1757).getFax());
	}

	@Test
	@DisplayName("Record 1758: Email is kyle@parsh.com")
	void EmailOfRecord1758() {
		assertEquals("kyle@parsh.com", customers.get(1757).getEmail());
	}

	@Test
	@DisplayName("Record 1758: Web is http://www.kyleparsh.com")
	void WebOfRecord1758() {
		assertEquals("http://www.kyleparsh.com", customers.get(1757).getWeb());
	}
}
