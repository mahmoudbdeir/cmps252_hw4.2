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
class Record_4634 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4634: FirstName is Carol")
	void FirstNameOfRecord4634() {
		assertEquals("Carol", customers.get(4633).getFirstName());
	}

	@Test
	@DisplayName("Record 4634: LastName is Garski")
	void LastNameOfRecord4634() {
		assertEquals("Garski", customers.get(4633).getLastName());
	}

	@Test
	@DisplayName("Record 4634: Company is Hopping Bottling Co")
	void CompanyOfRecord4634() {
		assertEquals("Hopping Bottling Co", customers.get(4633).getCompany());
	}

	@Test
	@DisplayName("Record 4634: Address is 13924 W Main St")
	void AddressOfRecord4634() {
		assertEquals("13924 W Main St", customers.get(4633).getAddress());
	}

	@Test
	@DisplayName("Record 4634: City is Larose")
	void CityOfRecord4634() {
		assertEquals("Larose", customers.get(4633).getCity());
	}

	@Test
	@DisplayName("Record 4634: County is Lafourche")
	void CountyOfRecord4634() {
		assertEquals("Lafourche", customers.get(4633).getCounty());
	}

	@Test
	@DisplayName("Record 4634: State is LA")
	void StateOfRecord4634() {
		assertEquals("LA", customers.get(4633).getState());
	}

	@Test
	@DisplayName("Record 4634: ZIP is 70373")
	void ZIPOfRecord4634() {
		assertEquals("70373", customers.get(4633).getZIP());
	}

	@Test
	@DisplayName("Record 4634: Phone is 985-693-3190")
	void PhoneOfRecord4634() {
		assertEquals("985-693-3190", customers.get(4633).getPhone());
	}

	@Test
	@DisplayName("Record 4634: Fax is 985-693-3436")
	void FaxOfRecord4634() {
		assertEquals("985-693-3436", customers.get(4633).getFax());
	}

	@Test
	@DisplayName("Record 4634: Email is carol@garski.com")
	void EmailOfRecord4634() {
		assertEquals("carol@garski.com", customers.get(4633).getEmail());
	}

	@Test
	@DisplayName("Record 4634: Web is http://www.carolgarski.com")
	void WebOfRecord4634() {
		assertEquals("http://www.carolgarski.com", customers.get(4633).getWeb());
	}
}
