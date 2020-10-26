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

@Tag("15")
class Record_2216 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2216: FirstName is Judith")
	void FirstNameOfRecord2216() {
		assertEquals("Judith", customers.get(2215).getFirstName());
	}

	@Test
	@DisplayName("Record 2216: LastName is Henrick")
	void LastNameOfRecord2216() {
		assertEquals("Henrick", customers.get(2215).getLastName());
	}

	@Test
	@DisplayName("Record 2216: Company is Laham, James S Cpa")
	void CompanyOfRecord2216() {
		assertEquals("Laham, James S Cpa", customers.get(2215).getCompany());
	}

	@Test
	@DisplayName("Record 2216: Address is 320 Washington St")
	void AddressOfRecord2216() {
		assertEquals("320 Washington St", customers.get(2215).getAddress());
	}

	@Test
	@DisplayName("Record 2216: City is Mount Vernon")
	void CityOfRecord2216() {
		assertEquals("Mount Vernon", customers.get(2215).getCity());
	}

	@Test
	@DisplayName("Record 2216: County is Westchester")
	void CountyOfRecord2216() {
		assertEquals("Westchester", customers.get(2215).getCounty());
	}

	@Test
	@DisplayName("Record 2216: State is NY")
	void StateOfRecord2216() {
		assertEquals("NY", customers.get(2215).getState());
	}

	@Test
	@DisplayName("Record 2216: ZIP is 10553")
	void ZIPOfRecord2216() {
		assertEquals("10553", customers.get(2215).getZIP());
	}

	@Test
	@DisplayName("Record 2216: Phone is 914-665-0960")
	void PhoneOfRecord2216() {
		assertEquals("914-665-0960", customers.get(2215).getPhone());
	}

	@Test
	@DisplayName("Record 2216: Fax is 914-665-9819")
	void FaxOfRecord2216() {
		assertEquals("914-665-9819", customers.get(2215).getFax());
	}

	@Test
	@DisplayName("Record 2216: Email is judith@henrick.com")
	void EmailOfRecord2216() {
		assertEquals("judith@henrick.com", customers.get(2215).getEmail());
	}

	@Test
	@DisplayName("Record 2216: Web is http://www.judithhenrick.com")
	void WebOfRecord2216() {
		assertEquals("http://www.judithhenrick.com", customers.get(2215).getWeb());
	}
}
