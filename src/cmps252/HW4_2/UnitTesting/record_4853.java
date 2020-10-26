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

@Tag("5")
class Record_4853 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4853: FirstName is Mari")
	void FirstNameOfRecord4853() {
		assertEquals("Mari", customers.get(4852).getFirstName());
	}

	@Test
	@DisplayName("Record 4853: LastName is Thrift")
	void LastNameOfRecord4853() {
		assertEquals("Thrift", customers.get(4852).getLastName());
	}

	@Test
	@DisplayName("Record 4853: Company is Universal Beverage Equip Inc")
	void CompanyOfRecord4853() {
		assertEquals("Universal Beverage Equip Inc", customers.get(4852).getCompany());
	}

	@Test
	@DisplayName("Record 4853: Address is 550 Elmwood Park Blvd  #-c")
	void AddressOfRecord4853() {
		assertEquals("550 Elmwood Park Blvd  #-c", customers.get(4852).getAddress());
	}

	@Test
	@DisplayName("Record 4853: City is New Orleans")
	void CityOfRecord4853() {
		assertEquals("New Orleans", customers.get(4852).getCity());
	}

	@Test
	@DisplayName("Record 4853: County is Jefferson")
	void CountyOfRecord4853() {
		assertEquals("Jefferson", customers.get(4852).getCounty());
	}

	@Test
	@DisplayName("Record 4853: State is LA")
	void StateOfRecord4853() {
		assertEquals("LA", customers.get(4852).getState());
	}

	@Test
	@DisplayName("Record 4853: ZIP is 70123")
	void ZIPOfRecord4853() {
		assertEquals("70123", customers.get(4852).getZIP());
	}

	@Test
	@DisplayName("Record 4853: Phone is 504-734-9276")
	void PhoneOfRecord4853() {
		assertEquals("504-734-9276", customers.get(4852).getPhone());
	}

	@Test
	@DisplayName("Record 4853: Fax is 504-734-8851")
	void FaxOfRecord4853() {
		assertEquals("504-734-8851", customers.get(4852).getFax());
	}

	@Test
	@DisplayName("Record 4853: Email is mari@thrift.com")
	void EmailOfRecord4853() {
		assertEquals("mari@thrift.com", customers.get(4852).getEmail());
	}

	@Test
	@DisplayName("Record 4853: Web is http://www.marithrift.com")
	void WebOfRecord4853() {
		assertEquals("http://www.marithrift.com", customers.get(4852).getWeb());
	}
}
