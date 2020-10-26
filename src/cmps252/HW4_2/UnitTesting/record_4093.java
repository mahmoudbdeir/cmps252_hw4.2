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

@Tag("34")
class Record_4093 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4093: FirstName is Edgardo")
	void FirstNameOfRecord4093() {
		assertEquals("Edgardo", customers.get(4092).getFirstName());
	}

	@Test
	@DisplayName("Record 4093: LastName is Buckmaster")
	void LastNameOfRecord4093() {
		assertEquals("Buckmaster", customers.get(4092).getLastName());
	}

	@Test
	@DisplayName("Record 4093: Company is Mstr Signs Divsn Masterco Inc")
	void CompanyOfRecord4093() {
		assertEquals("Mstr Signs Divsn Masterco Inc", customers.get(4092).getCompany());
	}

	@Test
	@DisplayName("Record 4093: Address is 79 Bloomfield Ave")
	void AddressOfRecord4093() {
		assertEquals("79 Bloomfield Ave", customers.get(4092).getAddress());
	}

	@Test
	@DisplayName("Record 4093: City is Caldwell")
	void CityOfRecord4093() {
		assertEquals("Caldwell", customers.get(4092).getCity());
	}

	@Test
	@DisplayName("Record 4093: County is Essex")
	void CountyOfRecord4093() {
		assertEquals("Essex", customers.get(4092).getCounty());
	}

	@Test
	@DisplayName("Record 4093: State is NJ")
	void StateOfRecord4093() {
		assertEquals("NJ", customers.get(4092).getState());
	}

	@Test
	@DisplayName("Record 4093: ZIP is 7006")
	void ZIPOfRecord4093() {
		assertEquals("7006", customers.get(4092).getZIP());
	}

	@Test
	@DisplayName("Record 4093: Phone is 973-226-5470")
	void PhoneOfRecord4093() {
		assertEquals("973-226-5470", customers.get(4092).getPhone());
	}

	@Test
	@DisplayName("Record 4093: Fax is 973-226-0576")
	void FaxOfRecord4093() {
		assertEquals("973-226-0576", customers.get(4092).getFax());
	}

	@Test
	@DisplayName("Record 4093: Email is edgardo@buckmaster.com")
	void EmailOfRecord4093() {
		assertEquals("edgardo@buckmaster.com", customers.get(4092).getEmail());
	}

	@Test
	@DisplayName("Record 4093: Web is http://www.edgardobuckmaster.com")
	void WebOfRecord4093() {
		assertEquals("http://www.edgardobuckmaster.com", customers.get(4092).getWeb());
	}
}
