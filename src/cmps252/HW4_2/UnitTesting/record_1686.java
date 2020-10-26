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

@Tag("45")
class Record_1686 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1686: FirstName is Carmen")
	void FirstNameOfRecord1686() {
		assertEquals("Carmen", customers.get(1685).getFirstName());
	}

	@Test
	@DisplayName("Record 1686: LastName is Kenkel")
	void LastNameOfRecord1686() {
		assertEquals("Kenkel", customers.get(1685).getLastName());
	}

	@Test
	@DisplayName("Record 1686: Company is Feder Trading Co Inc")
	void CompanyOfRecord1686() {
		assertEquals("Feder Trading Co Inc", customers.get(1685).getCompany());
	}

	@Test
	@DisplayName("Record 1686: Address is 2505 Lee Dr")
	void AddressOfRecord1686() {
		assertEquals("2505 Lee Dr", customers.get(1685).getAddress());
	}

	@Test
	@DisplayName("Record 1686: City is Pierre Part")
	void CityOfRecord1686() {
		assertEquals("Pierre Part", customers.get(1685).getCity());
	}

	@Test
	@DisplayName("Record 1686: County is Assumption")
	void CountyOfRecord1686() {
		assertEquals("Assumption", customers.get(1685).getCounty());
	}

	@Test
	@DisplayName("Record 1686: State is LA")
	void StateOfRecord1686() {
		assertEquals("LA", customers.get(1685).getState());
	}

	@Test
	@DisplayName("Record 1686: ZIP is 70339")
	void ZIPOfRecord1686() {
		assertEquals("70339", customers.get(1685).getZIP());
	}

	@Test
	@DisplayName("Record 1686: Phone is 985-252-7973")
	void PhoneOfRecord1686() {
		assertEquals("985-252-7973", customers.get(1685).getPhone());
	}

	@Test
	@DisplayName("Record 1686: Fax is 985-252-4305")
	void FaxOfRecord1686() {
		assertEquals("985-252-4305", customers.get(1685).getFax());
	}

	@Test
	@DisplayName("Record 1686: Email is carmen@kenkel.com")
	void EmailOfRecord1686() {
		assertEquals("carmen@kenkel.com", customers.get(1685).getEmail());
	}

	@Test
	@DisplayName("Record 1686: Web is http://www.carmenkenkel.com")
	void WebOfRecord1686() {
		assertEquals("http://www.carmenkenkel.com", customers.get(1685).getWeb());
	}
}
