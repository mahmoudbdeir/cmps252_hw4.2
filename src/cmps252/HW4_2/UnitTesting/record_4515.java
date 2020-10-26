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

@Tag("18")
class Record_4515 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4515: FirstName is Doris")
	void FirstNameOfRecord4515() {
		assertEquals("Doris", customers.get(4514).getFirstName());
	}

	@Test
	@DisplayName("Record 4515: LastName is Baldacci")
	void LastNameOfRecord4515() {
		assertEquals("Baldacci", customers.get(4514).getLastName());
	}

	@Test
	@DisplayName("Record 4515: Company is Wantage Excavating Co Inc")
	void CompanyOfRecord4515() {
		assertEquals("Wantage Excavating Co Inc", customers.get(4514).getCompany());
	}

	@Test
	@DisplayName("Record 4515: Address is 21 Law Dr")
	void AddressOfRecord4515() {
		assertEquals("21 Law Dr", customers.get(4514).getAddress());
	}

	@Test
	@DisplayName("Record 4515: City is Fairfield")
	void CityOfRecord4515() {
		assertEquals("Fairfield", customers.get(4514).getCity());
	}

	@Test
	@DisplayName("Record 4515: County is Essex")
	void CountyOfRecord4515() {
		assertEquals("Essex", customers.get(4514).getCounty());
	}

	@Test
	@DisplayName("Record 4515: State is NJ")
	void StateOfRecord4515() {
		assertEquals("NJ", customers.get(4514).getState());
	}

	@Test
	@DisplayName("Record 4515: ZIP is 7004")
	void ZIPOfRecord4515() {
		assertEquals("7004", customers.get(4514).getZIP());
	}

	@Test
	@DisplayName("Record 4515: Phone is 973-227-6985")
	void PhoneOfRecord4515() {
		assertEquals("973-227-6985", customers.get(4514).getPhone());
	}

	@Test
	@DisplayName("Record 4515: Fax is 973-227-9364")
	void FaxOfRecord4515() {
		assertEquals("973-227-9364", customers.get(4514).getFax());
	}

	@Test
	@DisplayName("Record 4515: Email is doris@baldacci.com")
	void EmailOfRecord4515() {
		assertEquals("doris@baldacci.com", customers.get(4514).getEmail());
	}

	@Test
	@DisplayName("Record 4515: Web is http://www.dorisbaldacci.com")
	void WebOfRecord4515() {
		assertEquals("http://www.dorisbaldacci.com", customers.get(4514).getWeb());
	}
}
