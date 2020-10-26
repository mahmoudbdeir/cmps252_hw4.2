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

@Tag("32")
class Record_4541 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4541: FirstName is Jamar")
	void FirstNameOfRecord4541() {
		assertEquals("Jamar", customers.get(4540).getFirstName());
	}

	@Test
	@DisplayName("Record 4541: LastName is Garry")
	void LastNameOfRecord4541() {
		assertEquals("Garry", customers.get(4540).getLastName());
	}

	@Test
	@DisplayName("Record 4541: Company is Power Auto & Truck Parts")
	void CompanyOfRecord4541() {
		assertEquals("Power Auto & Truck Parts", customers.get(4540).getCompany());
	}

	@Test
	@DisplayName("Record 4541: Address is 508 S Webster St")
	void AddressOfRecord4541() {
		assertEquals("508 S Webster St", customers.get(4540).getAddress());
	}

	@Test
	@DisplayName("Record 4541: City is Kokomo")
	void CityOfRecord4541() {
		assertEquals("Kokomo", customers.get(4540).getCity());
	}

	@Test
	@DisplayName("Record 4541: County is Howard")
	void CountyOfRecord4541() {
		assertEquals("Howard", customers.get(4540).getCounty());
	}

	@Test
	@DisplayName("Record 4541: State is IN")
	void StateOfRecord4541() {
		assertEquals("IN", customers.get(4540).getState());
	}

	@Test
	@DisplayName("Record 4541: ZIP is 46901")
	void ZIPOfRecord4541() {
		assertEquals("46901", customers.get(4540).getZIP());
	}

	@Test
	@DisplayName("Record 4541: Phone is 765-459-8252")
	void PhoneOfRecord4541() {
		assertEquals("765-459-8252", customers.get(4540).getPhone());
	}

	@Test
	@DisplayName("Record 4541: Fax is 765-459-9321")
	void FaxOfRecord4541() {
		assertEquals("765-459-9321", customers.get(4540).getFax());
	}

	@Test
	@DisplayName("Record 4541: Email is jamar@garry.com")
	void EmailOfRecord4541() {
		assertEquals("jamar@garry.com", customers.get(4540).getEmail());
	}

	@Test
	@DisplayName("Record 4541: Web is http://www.jamargarry.com")
	void WebOfRecord4541() {
		assertEquals("http://www.jamargarry.com", customers.get(4540).getWeb());
	}
}
