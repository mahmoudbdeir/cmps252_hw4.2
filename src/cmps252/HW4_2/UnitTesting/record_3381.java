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

@Tag("18")
class Record_3381 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3381: FirstName is Demetria")
	void FirstNameOfRecord3381() {
		assertEquals("Demetria", customers.get(3380).getFirstName());
	}

	@Test
	@DisplayName("Record 3381: LastName is Gaulden")
	void LastNameOfRecord3381() {
		assertEquals("Gaulden", customers.get(3380).getLastName());
	}

	@Test
	@DisplayName("Record 3381: Company is Robert Wilson Formal Wear")
	void CompanyOfRecord3381() {
		assertEquals("Robert Wilson Formal Wear", customers.get(3380).getCompany());
	}

	@Test
	@DisplayName("Record 3381: Address is 16582 Gothard St")
	void AddressOfRecord3381() {
		assertEquals("16582 Gothard St", customers.get(3380).getAddress());
	}

	@Test
	@DisplayName("Record 3381: City is Huntington Beach")
	void CityOfRecord3381() {
		assertEquals("Huntington Beach", customers.get(3380).getCity());
	}

	@Test
	@DisplayName("Record 3381: County is Orange")
	void CountyOfRecord3381() {
		assertEquals("Orange", customers.get(3380).getCounty());
	}

	@Test
	@DisplayName("Record 3381: State is CA")
	void StateOfRecord3381() {
		assertEquals("CA", customers.get(3380).getState());
	}

	@Test
	@DisplayName("Record 3381: ZIP is 92647")
	void ZIPOfRecord3381() {
		assertEquals("92647", customers.get(3380).getZIP());
	}

	@Test
	@DisplayName("Record 3381: Phone is 714-847-3054")
	void PhoneOfRecord3381() {
		assertEquals("714-847-3054", customers.get(3380).getPhone());
	}

	@Test
	@DisplayName("Record 3381: Fax is 714-847-2303")
	void FaxOfRecord3381() {
		assertEquals("714-847-2303", customers.get(3380).getFax());
	}

	@Test
	@DisplayName("Record 3381: Email is demetria@gaulden.com")
	void EmailOfRecord3381() {
		assertEquals("demetria@gaulden.com", customers.get(3380).getEmail());
	}

	@Test
	@DisplayName("Record 3381: Web is http://www.demetriagaulden.com")
	void WebOfRecord3381() {
		assertEquals("http://www.demetriagaulden.com", customers.get(3380).getWeb());
	}
}
