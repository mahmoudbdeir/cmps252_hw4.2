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

@Tag("7")
class Record_1437 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1437: FirstName is Joyce")
	void FirstNameOfRecord1437() {
		assertEquals("Joyce", customers.get(1436).getFirstName());
	}

	@Test
	@DisplayName("Record 1437: LastName is Darroch")
	void LastNameOfRecord1437() {
		assertEquals("Darroch", customers.get(1436).getLastName());
	}

	@Test
	@DisplayName("Record 1437: Company is Pennsylvania Hortl Scty")
	void CompanyOfRecord1437() {
		assertEquals("Pennsylvania Hortl Scty", customers.get(1436).getCompany());
	}

	@Test
	@DisplayName("Record 1437: Address is 16776 Bernardo Cent  #-109")
	void AddressOfRecord1437() {
		assertEquals("16776 Bernardo Cent  #-109", customers.get(1436).getAddress());
	}

	@Test
	@DisplayName("Record 1437: City is San Diego")
	void CityOfRecord1437() {
		assertEquals("San Diego", customers.get(1436).getCity());
	}

	@Test
	@DisplayName("Record 1437: County is San Diego")
	void CountyOfRecord1437() {
		assertEquals("San Diego", customers.get(1436).getCounty());
	}

	@Test
	@DisplayName("Record 1437: State is CA")
	void StateOfRecord1437() {
		assertEquals("CA", customers.get(1436).getState());
	}

	@Test
	@DisplayName("Record 1437: ZIP is 92128")
	void ZIPOfRecord1437() {
		assertEquals("92128", customers.get(1436).getZIP());
	}

	@Test
	@DisplayName("Record 1437: Phone is 858-487-4017")
	void PhoneOfRecord1437() {
		assertEquals("858-487-4017", customers.get(1436).getPhone());
	}

	@Test
	@DisplayName("Record 1437: Fax is 858-487-8412")
	void FaxOfRecord1437() {
		assertEquals("858-487-8412", customers.get(1436).getFax());
	}

	@Test
	@DisplayName("Record 1437: Email is joyce@darroch.com")
	void EmailOfRecord1437() {
		assertEquals("joyce@darroch.com", customers.get(1436).getEmail());
	}

	@Test
	@DisplayName("Record 1437: Web is http://www.joycedarroch.com")
	void WebOfRecord1437() {
		assertEquals("http://www.joycedarroch.com", customers.get(1436).getWeb());
	}
}
