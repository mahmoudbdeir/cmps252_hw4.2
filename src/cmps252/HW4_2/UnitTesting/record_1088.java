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
class Record_1088 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1088: FirstName is Felix")
	void FirstNameOfRecord1088() {
		assertEquals("Felix", customers.get(1087).getFirstName());
	}

	@Test
	@DisplayName("Record 1088: LastName is Steely")
	void LastNameOfRecord1088() {
		assertEquals("Steely", customers.get(1087).getLastName());
	}

	@Test
	@DisplayName("Record 1088: Company is H F S Sales")
	void CompanyOfRecord1088() {
		assertEquals("H F S Sales", customers.get(1087).getCompany());
	}

	@Test
	@DisplayName("Record 1088: Address is 1100 Main St")
	void AddressOfRecord1088() {
		assertEquals("1100 Main St", customers.get(1087).getAddress());
	}

	@Test
	@DisplayName("Record 1088: City is Buffalo")
	void CityOfRecord1088() {
		assertEquals("Buffalo", customers.get(1087).getCity());
	}

	@Test
	@DisplayName("Record 1088: County is Erie")
	void CountyOfRecord1088() {
		assertEquals("Erie", customers.get(1087).getCounty());
	}

	@Test
	@DisplayName("Record 1088: State is NY")
	void StateOfRecord1088() {
		assertEquals("NY", customers.get(1087).getState());
	}

	@Test
	@DisplayName("Record 1088: ZIP is 14209")
	void ZIPOfRecord1088() {
		assertEquals("14209", customers.get(1087).getZIP());
	}

	@Test
	@DisplayName("Record 1088: Phone is 716-878-6659")
	void PhoneOfRecord1088() {
		assertEquals("716-878-6659", customers.get(1087).getPhone());
	}

	@Test
	@DisplayName("Record 1088: Fax is 716-878-6507")
	void FaxOfRecord1088() {
		assertEquals("716-878-6507", customers.get(1087).getFax());
	}

	@Test
	@DisplayName("Record 1088: Email is felix@steely.com")
	void EmailOfRecord1088() {
		assertEquals("felix@steely.com", customers.get(1087).getEmail());
	}

	@Test
	@DisplayName("Record 1088: Web is http://www.felixsteely.com")
	void WebOfRecord1088() {
		assertEquals("http://www.felixsteely.com", customers.get(1087).getWeb());
	}
}
