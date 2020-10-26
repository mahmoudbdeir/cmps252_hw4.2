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

@Tag("6")
class Record_4815 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4815: FirstName is Alfreda")
	void FirstNameOfRecord4815() {
		assertEquals("Alfreda", customers.get(4814).getFirstName());
	}

	@Test
	@DisplayName("Record 4815: LastName is Niemczyk")
	void LastNameOfRecord4815() {
		assertEquals("Niemczyk", customers.get(4814).getLastName());
	}

	@Test
	@DisplayName("Record 4815: Company is Ramsey, Kim E Esq")
	void CompanyOfRecord4815() {
		assertEquals("Ramsey, Kim E Esq", customers.get(4814).getCompany());
	}

	@Test
	@DisplayName("Record 4815: Address is 1019 Church St")
	void AddressOfRecord4815() {
		assertEquals("1019 Church St", customers.get(4814).getAddress());
	}

	@Test
	@DisplayName("Record 4815: City is Lynchburg")
	void CityOfRecord4815() {
		assertEquals("Lynchburg", customers.get(4814).getCity());
	}

	@Test
	@DisplayName("Record 4815: County is Lynchburg City")
	void CountyOfRecord4815() {
		assertEquals("Lynchburg City", customers.get(4814).getCounty());
	}

	@Test
	@DisplayName("Record 4815: State is VA")
	void StateOfRecord4815() {
		assertEquals("VA", customers.get(4814).getState());
	}

	@Test
	@DisplayName("Record 4815: ZIP is 24504")
	void ZIPOfRecord4815() {
		assertEquals("24504", customers.get(4814).getZIP());
	}

	@Test
	@DisplayName("Record 4815: Phone is 434-845-7284")
	void PhoneOfRecord4815() {
		assertEquals("434-845-7284", customers.get(4814).getPhone());
	}

	@Test
	@DisplayName("Record 4815: Fax is 434-845-9325")
	void FaxOfRecord4815() {
		assertEquals("434-845-9325", customers.get(4814).getFax());
	}

	@Test
	@DisplayName("Record 4815: Email is alfreda@niemczyk.com")
	void EmailOfRecord4815() {
		assertEquals("alfreda@niemczyk.com", customers.get(4814).getEmail());
	}

	@Test
	@DisplayName("Record 4815: Web is http://www.alfredaniemczyk.com")
	void WebOfRecord4815() {
		assertEquals("http://www.alfredaniemczyk.com", customers.get(4814).getWeb());
	}
}
