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

@Tag("29")
class Record_1290 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1290: FirstName is Ladonna")
	void FirstNameOfRecord1290() {
		assertEquals("Ladonna", customers.get(1289).getFirstName());
	}

	@Test
	@DisplayName("Record 1290: LastName is Ironhorse")
	void LastNameOfRecord1290() {
		assertEquals("Ironhorse", customers.get(1289).getLastName());
	}

	@Test
	@DisplayName("Record 1290: Company is Next Day Signs")
	void CompanyOfRecord1290() {
		assertEquals("Next Day Signs", customers.get(1289).getCompany());
	}

	@Test
	@DisplayName("Record 1290: Address is 1145 Elizabeth Ave")
	void AddressOfRecord1290() {
		assertEquals("1145 Elizabeth Ave", customers.get(1289).getAddress());
	}

	@Test
	@DisplayName("Record 1290: City is Elizabeth")
	void CityOfRecord1290() {
		assertEquals("Elizabeth", customers.get(1289).getCity());
	}

	@Test
	@DisplayName("Record 1290: County is Union")
	void CountyOfRecord1290() {
		assertEquals("Union", customers.get(1289).getCounty());
	}

	@Test
	@DisplayName("Record 1290: State is NJ")
	void StateOfRecord1290() {
		assertEquals("NJ", customers.get(1289).getState());
	}

	@Test
	@DisplayName("Record 1290: ZIP is 7201")
	void ZIPOfRecord1290() {
		assertEquals("7201", customers.get(1289).getZIP());
	}

	@Test
	@DisplayName("Record 1290: Phone is 908-352-5665")
	void PhoneOfRecord1290() {
		assertEquals("908-352-5665", customers.get(1289).getPhone());
	}

	@Test
	@DisplayName("Record 1290: Fax is 908-352-4059")
	void FaxOfRecord1290() {
		assertEquals("908-352-4059", customers.get(1289).getFax());
	}

	@Test
	@DisplayName("Record 1290: Email is ladonna@ironhorse.com")
	void EmailOfRecord1290() {
		assertEquals("ladonna@ironhorse.com", customers.get(1289).getEmail());
	}

	@Test
	@DisplayName("Record 1290: Web is http://www.ladonnaironhorse.com")
	void WebOfRecord1290() {
		assertEquals("http://www.ladonnaironhorse.com", customers.get(1289).getWeb());
	}
}
