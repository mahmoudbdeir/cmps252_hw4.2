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

@Tag("46")
class Record_4661 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4661: FirstName is Terry")
	void FirstNameOfRecord4661() {
		assertEquals("Terry", customers.get(4660).getFirstName());
	}

	@Test
	@DisplayName("Record 4661: LastName is Kuerbits")
	void LastNameOfRecord4661() {
		assertEquals("Kuerbits", customers.get(4660).getLastName());
	}

	@Test
	@DisplayName("Record 4661: Company is Lewis F Woodward Jr And Assocs")
	void CompanyOfRecord4661() {
		assertEquals("Lewis F Woodward Jr And Assocs", customers.get(4660).getCompany());
	}

	@Test
	@DisplayName("Record 4661: Address is 2500 Augustine Dr")
	void AddressOfRecord4661() {
		assertEquals("2500 Augustine Dr", customers.get(4660).getAddress());
	}

	@Test
	@DisplayName("Record 4661: City is Santa Clara")
	void CityOfRecord4661() {
		assertEquals("Santa Clara", customers.get(4660).getCity());
	}

	@Test
	@DisplayName("Record 4661: County is Santa Clara")
	void CountyOfRecord4661() {
		assertEquals("Santa Clara", customers.get(4660).getCounty());
	}

	@Test
	@DisplayName("Record 4661: State is CA")
	void StateOfRecord4661() {
		assertEquals("CA", customers.get(4660).getState());
	}

	@Test
	@DisplayName("Record 4661: ZIP is 95054")
	void ZIPOfRecord4661() {
		assertEquals("95054", customers.get(4660).getZIP());
	}

	@Test
	@DisplayName("Record 4661: Phone is 408-980-5311")
	void PhoneOfRecord4661() {
		assertEquals("408-980-5311", customers.get(4660).getPhone());
	}

	@Test
	@DisplayName("Record 4661: Fax is 408-980-0078")
	void FaxOfRecord4661() {
		assertEquals("408-980-0078", customers.get(4660).getFax());
	}

	@Test
	@DisplayName("Record 4661: Email is terry@kuerbits.com")
	void EmailOfRecord4661() {
		assertEquals("terry@kuerbits.com", customers.get(4660).getEmail());
	}

	@Test
	@DisplayName("Record 4661: Web is http://www.terrykuerbits.com")
	void WebOfRecord4661() {
		assertEquals("http://www.terrykuerbits.com", customers.get(4660).getWeb());
	}
}
