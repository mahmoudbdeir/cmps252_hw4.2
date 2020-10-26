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
class Record_4216 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4216: FirstName is Brock")
	void FirstNameOfRecord4216() {
		assertEquals("Brock", customers.get(4215).getFirstName());
	}

	@Test
	@DisplayName("Record 4216: LastName is Tassey")
	void LastNameOfRecord4216() {
		assertEquals("Tassey", customers.get(4215).getLastName());
	}

	@Test
	@DisplayName("Record 4216: Company is Williams, Constance S Cpa")
	void CompanyOfRecord4216() {
		assertEquals("Williams, Constance S Cpa", customers.get(4215).getCompany());
	}

	@Test
	@DisplayName("Record 4216: Address is 425 Cedar")
	void AddressOfRecord4216() {
		assertEquals("425 Cedar", customers.get(4215).getAddress());
	}

	@Test
	@DisplayName("Record 4216: City is Buena Vista")
	void CityOfRecord4216() {
		assertEquals("Buena Vista", customers.get(4215).getCity());
	}

	@Test
	@DisplayName("Record 4216: County is Chaffee")
	void CountyOfRecord4216() {
		assertEquals("Chaffee", customers.get(4215).getCounty());
	}

	@Test
	@DisplayName("Record 4216: State is CO")
	void StateOfRecord4216() {
		assertEquals("CO", customers.get(4215).getState());
	}

	@Test
	@DisplayName("Record 4216: ZIP is 81211")
	void ZIPOfRecord4216() {
		assertEquals("81211", customers.get(4215).getZIP());
	}

	@Test
	@DisplayName("Record 4216: Phone is 719-395-5644")
	void PhoneOfRecord4216() {
		assertEquals("719-395-5644", customers.get(4215).getPhone());
	}

	@Test
	@DisplayName("Record 4216: Fax is 719-395-0604")
	void FaxOfRecord4216() {
		assertEquals("719-395-0604", customers.get(4215).getFax());
	}

	@Test
	@DisplayName("Record 4216: Email is brock@tassey.com")
	void EmailOfRecord4216() {
		assertEquals("brock@tassey.com", customers.get(4215).getEmail());
	}

	@Test
	@DisplayName("Record 4216: Web is http://www.brocktassey.com")
	void WebOfRecord4216() {
		assertEquals("http://www.brocktassey.com", customers.get(4215).getWeb());
	}
}
